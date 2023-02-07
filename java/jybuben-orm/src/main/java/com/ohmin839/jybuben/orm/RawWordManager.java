package com.ohmin839.jybuben.orm;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class RawWordManager {
    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public RawWord create(RawWord entity) {
        entityManager.persist(entity);
        entityManager.flush();
        entityManager.refresh(entity);
        return entity;
    }

    public RawWord findOneByText(String text) {
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<RawWord> cq = cb.createQuery(RawWord.class);
            Root<RawWord> root = cq.from(RawWord.class);
            cq.where(
                cb.and(
                    cb.equal(root.get("text"), text),
                    cb.equal(root.get("delFlg"), false)));
            TypedQuery<RawWord> tq = entityManager.createQuery(cq);
            return tq.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
