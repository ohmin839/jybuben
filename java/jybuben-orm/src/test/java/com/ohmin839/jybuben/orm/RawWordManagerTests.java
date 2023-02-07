package com.ohmin839.jybuben.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;

import org.junit.jupiter.api.Test;

import com.ohmin839.jybuben.orm.env.TransactionManagerTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Timestamp;

public class RawWordManagerTests extends TransactionManagerTest {

    @Test
    public void testStoreAndLoad() throws Exception {

        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("jybuben-orm-persistence-unit");

        try {
            // store part
            {
                UserTransaction tx = TM.getUserTransaction();
                tx.begin();

                EntityManager em = emf.createEntityManager();
                RawWordManager rawWordManager = new RawWordManager();
                rawWordManager.setEntityManager(em);

                RawWord entity = new RawWord();
                entity.setText("Hello World!");
                Timestamp now = new Timestamp(System.currentTimeMillis());
                entity.setCrtTimestamp(now);
                entity.setUpdTimestamp(now);
                rawWordManager.create(entity);
                assertNotNull(entity.getId());

                tx.commit();
                em.close();
            }
            // load part
            {
                UserTransaction tx = TM.getUserTransaction();
                tx.begin();

                EntityManager em = emf.createEntityManager();
                RawWordManager rawWordManager = new RawWordManager();
                rawWordManager.setEntityManager(em);

                RawWord result1 = rawWordManager.findOneByText("Hello World!");
                RawWord result2 = rawWordManager.findOneByText("Hello, World!");
                assertNotNull(result1);
                assertNull(result2);

                tx.commit();
                em.close();
            }

        } finally {
            TM.rollback();
            emf.close();
        }
    }
}