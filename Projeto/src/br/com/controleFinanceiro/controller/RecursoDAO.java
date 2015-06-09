package br.com.controleFinanceiro.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.controleFinanceiro.entidade.Recurso;

public class RecursoDAO {
protected EntityManager entityManager;
	
	public RecursoDAO() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleFinanc");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public void persist(Recurso recurso) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(recurso);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	
	 public Recurso getById(final int id) {
	        return entityManager.find(Recurso.class, id);
	    }
	 
	 public List<Recurso> findAll() {
	        return entityManager.createQuery("FROM " + Recurso.class.getName())
	                .getResultList();
	    }
	 
	 public void remove(Recurso recurso) {
	        try {
	            entityManager.getTransaction().begin();
	            recurso = entityManager.find(Recurso.class, recurso.getId());
	            entityManager.remove(recurso);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }
	 
	 public void merge(Recurso recurso) {
	        try {
	            entityManager.getTransaction().begin();
	            entityManager.merge(recurso);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }

}
