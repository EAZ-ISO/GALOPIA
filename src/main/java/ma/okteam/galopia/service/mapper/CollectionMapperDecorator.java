package ma.okteam.galopia.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.dozer.Mapper;
import org.dozer.MappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CollectionMapperDecorator implements Mapper
{
   
   @Autowired	
   private Mapper baseMapper;
   
   public CollectionMapperDecorator() {}
   
   public CollectionMapperDecorator(Mapper baseMapper)
   {
      this.baseMapper = baseMapper;      
   }

   public <T> List<T> mapCollection(Object[] source, Class<T> destinationClass)
   {
      return mapCollection(Arrays.asList(source), destinationClass);
   }

   public <T> List<T> mapCollection(Object[] source, List<T> destination, Class<T> destinationClass)
   {
      return mapCollection(Arrays.asList(source), destination, destinationClass);
   }

   public <T> List<T> mapCollection(Collection<? extends Object> source, Class<T> destinationClass)
   {      
      return mapCollection(source, null, destinationClass);
   }   

   public <T> List<T> mapCollection(Collection<? extends Object> source, List<T> destination, Class<T> destinationClass)
   {
      if(destination == null)
         destination = new ArrayList<T>();

      for(Object sourceObj : source)
      {
         destination.add(map(sourceObj, destinationClass));
      }

      return destination;      
   }

   public <T> T map(Object source, Class<T> destinationClass, String mapId) throws MappingException
   {
      return baseMapper.map(source, destinationClass, mapId);
   }

   public <T> T map(Object source, Class<T> destinationClass) throws MappingException
   {
      return baseMapper.map(source, destinationClass);
   }

   public void map(Object source, Object destination, String mapId) throws MappingException
   {
      baseMapper.map(source, destination, mapId);
   }

   public void map(Object source, Object destination) throws MappingException
   {
      baseMapper.map(source, destination);
   }
}
