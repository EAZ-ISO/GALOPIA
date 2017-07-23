package ma.okteam.galopia.service;

import java.io.Serializable;
import java.util.List;

import ma.okteam.galopia.persistance.utils.GalopiaCriterion;

import org.hibernate.criterion.Criterion;

public interface IBasicDAOService<T,U> {

	public T saveOrUpdate(U frontBean);
	
	public void delete(Integer id);
	
	public List<U> search(Criterion root, Integer firstElmt, Integer maxResult, Boolean asc, 
			List<String> orderProps, GalopiaCriterion ...associations);
	
	
	public U findById(Serializable id);
}
