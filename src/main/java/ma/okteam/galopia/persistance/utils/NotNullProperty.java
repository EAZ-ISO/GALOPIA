package ma.okteam.galopia.persistance.utils;

import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.type.Type;

public class NotNullProperty implements PropertySelector {

	public static final NotNullProperty INSTANCE = new NotNullProperty();
	private NotNullProperty() {}
	
	@Override
	public boolean include(Object propertyValue, String propertyName, Type type) {
		// TODO Auto-generated method stub
		return propertyValue != null;
	}

}
