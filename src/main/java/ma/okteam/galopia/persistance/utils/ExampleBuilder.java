/**
 * 
 */
package ma.okteam.galopia.persistance.utils;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.sql.JoinType;

/**
 * classe permetatnt de créer des criterion de types exemples
 * utilisable par l'API Criteria
 * @author omar HACHAMI
 *
 */
public final class ExampleBuilder {

	/**
	 * construit un criterion "exemple" 
	 * @param example
	 * @param exludeNull
	 * @param excludeProp
	 * @param enableLike
	 * @param matchMode
	 * @param association TODO
	 * @return
	 */
	public static GalopiaCriterion buildExample(Object example, boolean exludeNull, List<String> excludeProp, 
			boolean enableLike, MatchMode matchMode, boolean association, String associationName) {
		
		GalopiaCriterion qbe = association ? GalopiaCriterion.createAssociation(example, associationName) : GalopiaCriterion.create(example);
		
		//utiliser like dans la requete
		if(enableLike) {
			if(matchMode != null) {
				qbe.enableLike(matchMode);
			}else {
				qbe.enableLike();
			}
		}
		//exclusion des valeurs null
		if(exludeNull) {
			qbe.excludeZeroes();
		}else {
			qbe.excludeNone();
		}
		
		//exclusion d'attributs
		if(excludeProp != null && !excludeProp.isEmpty()) {
			for(String excluded : excludeProp) {
				qbe.excludeProperty(excluded);
			}
		}
		return qbe;
	}
	
	/**
	 * creation d'une criteria à partir d'exemples
	 * @param root
	 * @param assosiations
	 * @return
	 */
	public static DetachedCriteria buildCriteria(GalopiaCriterion root, GalopiaCriterion...associations) {
		DetachedCriteria criteria = DetachedCriteria.forClass(root.getClazz());
		criteria.add(root);
		
		if(associations != null && associations.length > 0) {
			for(GalopiaCriterion criterion : associations) {
				criteria.createCriteria(criterion.getAttributeName()).add(criterion);
			}
		}
		return criteria;
	}
	
	public static DetachedCriteria buildCriteria(Class<?> clazz, Criterion root, GalopiaCriterion...associations) {
		DetachedCriteria criteria = DetachedCriteria.forClass(clazz);
		criteria.add(root);
		
		if(associations != null && associations.length > 0) {
			for(GalopiaCriterion criterion : associations) {
				criteria.createCriteria(criterion.getAttributeName(), JoinType.LEFT_OUTER_JOIN).add(criterion);
				
			}
		}
		return criteria;
	}
	
	/**
	 * construit un exemple d'une association
	 * @param example
	 * @param association
	 * @return
	 */
	public static GalopiaCriterion buildAssociation(Object example, String associationName) {
		return buildExample(example, true, null, false, null, true, associationName);
	}
	
	/**
	 * construit un exemple simple
	 * @param example
	 * @return
	 */
	public static GalopiaCriterion buildExample(Object example) {
		return buildExample(example, true, null, false, null, false, null);
	}
}
