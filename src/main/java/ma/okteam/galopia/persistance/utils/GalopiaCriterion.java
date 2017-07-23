/**
 * 
 */
package ma.okteam.galopia.persistance.utils;

import org.hibernate.criterion.Example;

/**
 * Criterion permettant d'encapsuler un exemple
 * @author omar HACHAMI
 *
 */
public class GalopiaCriterion extends Example {

	private Class clazz;
	private String attributeName;
	
	/**
	 * @param exampleEntity
	 * @param selector
	 */
	protected GalopiaCriterion(Object exampleEntity, PropertySelector selector) {
		super(exampleEntity, selector);
		this.clazz = exampleEntity != null ? exampleEntity.getClass() : null;
	}
	
	/**
	 * 
	 * @param exampleEntity
	 * @param selector
	 * @param attributeName
	 */
	protected GalopiaCriterion(Object exampleEntity, PropertySelector selector, String attributeName) {
		this(exampleEntity, selector);
		
		if(attributeName != null && !attributeName.isEmpty()) {
			this.attributeName = attributeName;
		}else {
			this.attributeName = buildAttributeName();
		}
		
	}
	
	/**
	 * 
	 * @param exampleEntity
	 * @return
	 */
	public static GalopiaCriterion create(Object exampleEntity) {
		if ( exampleEntity == null ) {
			throw new NullPointerException( "null example entity" );
		}
		return new GalopiaCriterion( exampleEntity, NotNullProperty.INSTANCE );
	}
	
	/**
	 * 
	 * @param exampleEntity
	 * @return
	 */
	public static GalopiaCriterion createAssociation(Object exampleEntity, String attributeName) {
		if ( exampleEntity == null ) {
			throw new NullPointerException( "null example entity" );
		}
		return new GalopiaCriterion( exampleEntity, NotNullProperty.INSTANCE, attributeName);
	}
	
	/**
	 * construit le nom de l'attribut de l'association s'il n'est pas fourni
	 * @return
	 */
	private String buildAttributeName() {
		String name = getClazz().getSimpleName();
		if( name != null && !name.isEmpty()) {
			 
			String first = ("" + getClazz().getSimpleName().charAt(0)).toLowerCase();
			name = first.concat(name.substring(1));
		}
		
		return name;
	}
	
	/**
	 * @return the clazz
	 */
	public Class getClazz() {
		return clazz;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

}
