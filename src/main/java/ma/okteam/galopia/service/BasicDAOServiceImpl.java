package ma.okteam.galopia.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import ma.okteam.galopia.persistance.dao.BasicDAO;
import ma.okteam.galopia.persistance.utils.ExampleBuilder;
import ma.okteam.galopia.persistance.utils.GalopiaCriterion;
import ma.okteam.galopia.service.mapper.CollectionMapperDecorator;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BasicDAOServiceImpl<T,U> implements IBasicDAOService<T, U> {

	protected BasicDAO<T> dao;
	@Autowired
	protected CollectionMapperDecorator collectionMapper;
	private SessionFactory sessionFactory;
	
	private Class<U> frontClass;
	
	public BasicDAOServiceImpl() {
		this.frontClass = ((Class<U>) ((ParameterizedType) getClass()
		        .getGenericSuperclass()).getActualTypeArguments()[1]);
	}
	
	public T saveOrUpdate(U frontBean) {
		T entity = collectionMapper.map(frontBean, dao.getClazz());
		return dao.merge(entity);
	}
	
	public void delete(Integer id) {
		dao.deleteById(id);
	}
	
	public List<U> search(Criterion root, Integer firstElmt, Integer maxResult, Boolean asc, 
			List<String> orderProps, GalopiaCriterion ...associations) {
		
		if(root != null) {
			List<T> result = dao.getListByExemple(firstElmt, maxResult, asc, orderProps, 
					ExampleBuilder.buildCriteria(dao.getClazz(), root, associations));
			if(result != null) {
				return collectionMapper.mapCollection(result, frontClass);
			}
		}
		return null;
	}

	@Override
	public U findById(Serializable id) {
		T result = dao.getById(id);
		return result != null ? collectionMapper.map(result, frontClass) : null;
	}

	public CollectionMapperDecorator getCollectionMapper() {
		return collectionMapper;
	}

	public void setCollectionMapper(CollectionMapperDecorator collectionMapper) {
		this.collectionMapper = collectionMapper;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public BasicDAO<T> getDao() {
		return dao;
	}

	@Autowired
	public void setDao(BasicDAO<T> dao) {
		this.dao = dao;
		this.dao.setClazz(((Class<T>) ((ParameterizedType) getClass()
		        .getGenericSuperclass()).getActualTypeArguments()[0]));
	}
	
	
}
