package br.com.controleFinanceiro.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import br.com.controleFinanceiro.entidade.User;

public class UserDAO {
protected EntityManager entityManager;

	
	public UserDAO() {
        entityManager = getEntityManager();
    }
	
	private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleFinanc");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
	
	public void persist(User user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
	
	 public User getById(final int id) {
	        return entityManager.find(User.class, id);
	    }
	 
	 public List<User> findAll() {
	        return entityManager.createQuery("FROM " + User.class.getName()).getResultList();
	    }
	 
	 public void remove(User user) {
	        try {
	            entityManager.getTransaction().begin();
	            user = entityManager.find(User.class, user.getId());
	            entityManager.remove(user);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }
	 
	 public void merge(User user) {
	        try {
	            entityManager.getTransaction().begin();
	            entityManager.merge(user);
	            entityManager.getTransaction().commit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            entityManager.getTransaction().rollback();
	        }
	    }
	 
	
	/* public void logar(){
		 entityManager.createQuery("FROM user where");
		 String hql = "from user where login = :login"; 
		 Query query = (Query) entityManager.createQuery(hql); 
		 query.setString("login","elcio");

		 
	 }
	 
	 public static void main(String[] args) {
		UserDAO a = new UserDAO();
		
		a.logar();
	}*/
		 

}
