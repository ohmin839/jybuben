package com.ohmin839.jybuben.rsom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TRawWordTest {

    private SqlSession sqlSession = null;

    @BeforeEach
    void setup() throws Exception {
        try (Reader reader = Resources.getResourceAsReader("com/ohmin839/jybuben/rsom/mybatis-config-test.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
        }
        try (Scanner scanner = new Scanner(Resources.getResourceAsReader("com/ohmin839/jybuben/rsom/schema.sql"))) {
            String sql = scanner.useDelimiter("\\A").next();
            sqlSession.update("runScript", sql);
            sqlSession.commit();
        }
        try (Scanner scanner = new Scanner(Resources.getResourceAsReader("com/ohmin839/jybuben/rsom/data-test.sql"))) {
            String sql = scanner.useDelimiter("\\A").next();
            sqlSession.update("runScript", sql);
            sqlSession.commit();
        }
    }

    @Test
    void testMergeWhenMatched() throws Exception {
        sqlSession.update("mergeRawWord", "Ա");
        List<TRawWord> results = sqlSession.selectList("selectAllTRawWords");
        assertEquals(5, results.size());
        assertEquals("Ա", results.get(0).getVal()); 
        assertEquals("Բ", results.get(1).getVal()); 
        assertEquals("Գ", results.get(2).getVal()); 
        assertEquals("Դ", results.get(3).getVal()); 
        assertEquals("Ե", results.get(4).getVal()); 
    }

    @Test
    void testMergeWhenNotMatched() throws Exception {
        sqlSession.update("mergeRawWord", "Զ");
        List<TRawWord> results = sqlSession.selectList("selectAllTRawWords");
        assertEquals(6, results.size());
        assertEquals("Ա", results.get(0).getVal()); 
        assertEquals("Բ", results.get(1).getVal()); 
        assertEquals("Գ", results.get(2).getVal()); 
        assertEquals("Դ", results.get(3).getVal()); 
        assertEquals("Ե", results.get(4).getVal()); 
        assertEquals("Զ", results.get(5).getVal()); 
    }

    @AfterEach
    void tearDown() throws Exception {
        sqlSession.close();
    }
}