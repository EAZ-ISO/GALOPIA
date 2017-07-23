package ma.okteam.galopia.service.mapper;

import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

public class BlobCustomConverter implements CustomConverter {
	  
	  public Object convert(Object destination, Object source, 
	      Class destClass, Class sourceClass) {
	    if (source == null) {
	      return null;
	    }
	    Blob dest = null;
	    if (source instanceof byte[]) {
	    	try {
				dest = new SerialBlob((byte[])source);
			} catch (Exception e) {
				throw new MappingException(e.getMessage());
			}
	      return dest;
	    } else if (source instanceof Blob) {
	    	
	      try {
	    	  Blob temp = (Blob) source;
	    	  return temp != null && temp.length() > 1 ? temp.getBytes(1L, (int)temp.length()) : null;
	      } catch (SQLException e) {
	    	  throw new MappingException(e.getMessage());
	      }
	    } else {
	      throw new MappingException("Converter TestCustomConverter "
	          + "used incorrectly. Arguments passed in were:"
	          + destination + " and " + source);
	    }
	  }
}
	     