package main.java.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MeasurerJpaDAO {
	private static MeasurerJpaDAO instance;
	protected EntityManager entityManager;
	
	public static MeasurerJpaDAO getInstance() {
		if (instance == null) {
			instance = new MeasurerJpaDAO();
		}
		
		return instance;
	}
	
	private MeasurerJpaDAO() {
		entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("medidores-persistence");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	public MeasurerModel getById(final int id) {
	      return entityManager.find(MeasurerModel.class, id);
	}
	
	@SuppressWarnings("unchecked")
    public List<MeasurerModel> findAll() {
      //return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
    	return entityManager.createQuery("select m FROM " + MeasurerModel.class.getName() + " m").getResultList();
    }
	
	public void persist(MeasurerModel measurer) {
	      try {
	         entityManager.getTransaction().begin();
	         entityManager.persist(measurer);
	         entityManager.getTransaction().commit();
	      } catch (Exception ex) {
	         ex.printStackTrace();
	         entityManager.getTransaction().rollback();
	      }
	}
	
	public void merge(MeasurerModel measurer) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(measurer);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	
	public void remove(MeasurerModel measurer) {
	      try {
	         entityManager.getTransaction().begin();
	         measurer = entityManager.find(MeasurerModel.class, measurer.getId());
	         entityManager.remove(measurer);
	         entityManager.getTransaction().commit();
	      } catch (Exception ex) {
	         ex.printStackTrace();
	         entityManager.getTransaction().rollback();
	      }
	}
	
	public void removeById(final int id) {
	      try {
	         MeasurerModel measurer = getById(id);
	         remove(measurer);
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	}
}
