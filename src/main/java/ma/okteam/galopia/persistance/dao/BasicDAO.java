package ma.okteam.galopia.persistance.dao;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * classe abstraite fournissant les methodes necessaires 
 * à l'accès à la base de données
 * @author omar HACHAMI
 *
 * @param <T>
 */
@SuppressWarnings("unchecked")
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BasicDAO<T> extends AbstractDAO<T> {
	
	public BasicDAO(Class<T> clazz) {
		setClazz(clazz);
	}
	
	public BasicDAO() {}
}
