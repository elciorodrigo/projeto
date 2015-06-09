package br.com.controleFinanceiro.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.controleFinanceiro.entidade.Contas;

public class ContasDAO {

protected EntityManager entityManager;
	
	public ContasDAO() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleFinanc");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public void persist(Contas contas) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(contas);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	
	 public Contas getById(final int id) {
	        return entityManager.find(Contas.class, id);
	    }
	 
	 public List<Contas> findAll() {
	        return entityManager.createQuery("FROM " + Contas.class.getName())
	                .getResultList();
	    }
	 
	 public void remove(Contas contas) {
	        try {
	            entityManager.getTransaction().begin();
	            contas = entityManager.find(Contas.class, contas.getId());
	            entityManager.remove(contas);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }
	 
	 public void merge(Contas contas) {
	        try {
	            entityManager.getTransaction().begin();
	            entityManager.merge(contas);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }
	
}
