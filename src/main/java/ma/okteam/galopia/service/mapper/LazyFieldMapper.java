package ma.okteam.galopia.service.mapper;

import org.dozer.CustomFieldMapper;
import org.dozer.classmap.ClassMap;
import org.dozer.fieldmap.FieldMap;
import org.hibernate.Hibernate;

public class LazyFieldMapper implements CustomFieldMapper 
{
    public boolean mapField(Object source, Object destination, Object sourceFieldValue, ClassMap classMap, FieldMap fieldMapping) 
    {       
    	if(!Hibernate.isInitialized(sourceFieldValue)) {
    		// Set destination to null, and tell dozer that the field is mapped
            destination = null;
            return true;
    	}

        return false;
    }

}