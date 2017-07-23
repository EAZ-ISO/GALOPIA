package ma.okteam.galopia.persistance.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> clazz;
	

	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}
    
	/**
	 * recherche complète par exemple
	 * @param firstResult TODO
	 * @param maxResult TODO
	 * @param asc TODO
	 * @param orderProps TODO
	 * @param example object exemple
	 * @return
	 */
	public List<T> getListByExemple(Integer firstResult, Integer maxResult, Boolean asc, List<String> orderProps, DetachedCriteria detached) {
		
		if(detached != null) {
			Criteria crit = detached.getExecutableCriteria(getCurrentSession());
			//gestion de la pagination
			if(firstResult != null) {
				crit.setFirstResult(firstResult);
			}
			
			if(maxResult != null) {
				crit.setMaxResults(maxResult);
			}
			
			//gestion du tri
			if(asc != null && orderProps != null && !orderProps.isEmpty()) {
				for(String orderProp : orderProps) {
					if(asc) {
						crit.addOrder(Order.asc(orderProp));
					}else {
						crit.addOrder(Order.desc(orderProp));
					}
				}
			}
			
			return (List<T>) crit.list();
		}
		
		return null;
		
	}
	
	public Criteria getExecutableCriteria(DetachedCriteria detachedCriteria) {
		return detachedCriteria.getExecutableCriteria(getCurrentSession());
	}
	
	/**
	 * rechercher par identifiant
	 * @param clazz
	 * @param id
	 * @return
	 */
	public T getById(Integer id) {
		return (T) getCurrentSession().get(clazz, id);
	}
	
	public T getById(Serializable id) {
		return (T) getCurrentSession().get(clazz, id);
	}
	
	/**
	 * création / mise à jour
	 * @param toSave
	 */
	public void saveOrUpdate(T toSave) {
		getCurrentSession().saveOrUpdate(toSave);
	}
	
	public Integer save(T tosave) {
		return (Integer) getCurrentSession().save(tosave);
	}
	
	public void saveEmbdded(T tosave) { 
		getCurrentSession().saveOrUpdate(tosave);
	}
	
	public T merge(Object toMerge) {
		return (T)getCurrentSession().merge(toMerge);
	}
	
	/**
	 * rechercher tout les résultats de la table
	 * @return
	 */
	public List<T> findAll()  {
		String query = "from " + clazz.getSimpleName();
		return (List<T>)getCurrentSession().createQuery(query).list();
	}
	
	public List<T> findAll(String order)  {
		String query = "from " + clazz.getSimpleName() + " order by " + order + " asc";
		return (List<T>)getCurrentSession().createQuery(query).list();
	}
	
	/**
	 * supprimer une ligne de la base via son identifiant
	 * @param id
	 */
	public void deleteById(Integer id) {
		T toDelete = getById(id);
		delete(toDelete);
	}
	
	/**
	 * supprimer une ligne de la base via son identifiant
	 * @param id
	 */
	public void deleteById(Serializable id) {
		T toDelete = getById(id);
		delete(toDelete);
	}
	
	/**
	 * supprimer une ligne via son objet Hibernate
	 * @param toDelete
	 */
	public void delete(T toDelete) {
		getCurrentSession().delete(toDelete);
	}
	
	@SuppressWarnings("rawtypes")
	public List<T> ExecuteQuery(String hql, Map<String, Object> params) {
		Query query = getCurrentSession().createQuery(hql);
		if(params != null && !params.isEmpty()) {
			for(String key : params.keySet()) {
				Object value = params.get(key);
				if(value != null) {
					if(value instanceof Collection) {
						Collection c = (Collection) value;
						query.setParameterList(key, c);
					}else {
						query.setParameter(key, value);
					}
					
				}
			}
		}
		
		return query.list();
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}


	public Class<T> getClazz() {
		return clazz;
	}
}
