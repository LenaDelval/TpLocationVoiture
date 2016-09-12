package com.adaming.tplocation.dao;

import java.util.List;
import java.util.logging.Logger;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;




public abstract class GenericDaoImpl<T> implements IGenericDAO<T> {
	
	   @PersistenceContext
	    protected EntityManager em;
	   
	   Logger log = Logger.getLogger("GenericDaoImpl");

	    private Class<T> type;

	    @SuppressWarnings("unchecked")
		public GenericDaoImpl() {
	        Type t = getClass().getGenericSuperclass();
	        ParameterizedType pt = (ParameterizedType) t;
	        type = (Class<T>) pt.getActualTypeArguments()[0];
	    }

		@Override
		public T add(T t) {
			em.persist(t);
			log.info(" Le " + type.getSimpleName() + "  : " + t + " a bien été ajouté !");
			return t;
		}

		@Override
		public T update(T t) {
			em.merge(t);
			log.info(" Le " + type.getSimpleName() + "  : " + t + " a bien été modifié !");
			return t;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<T> getAll() {
			Query query = em.createQuery("from " + type.getSimpleName());
			log.info("il existe " + query.getResultList().size() + " " + type.getSimpleName() + "dans la BDD");
			return query.getResultList();
		}

		@Override
		public T getById(Long pId) {
			T t = em.find(type, pId);
			log.info(" Le " + t.getClass().getSimpleName() + "  : " + t + " a bien été trouvé !");
			return t;
		}

	    
	    
	    

}
