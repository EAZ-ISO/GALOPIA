package ma.okteam.galopia.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggerAspect {

	private static Logger LOG = LoggerFactory.getLogger(LoggerAspect.class);

	@Before("ma.okteam.galopia.aop.SystemArchitecture.inDataAccessLayer()")
	public void logEnterDAOLayer(JoinPoint joinPoint) {
		if(LOG.isDebugEnabled()) {
			List<Object> params = Arrays.asList(joinPoint.getArgs());
			
			StringBuilder builder = new StringBuilder("Start Executing ").
					append(joinPoint.getSignature().getDeclaringType().getSimpleName()).
					append(".").append(joinPoint.getSignature().getName()).
					append(" with params :[").append(params.toString()).append("]");
			
			LOG.debug(builder.toString());
		}
	}

	
	@AfterReturning(
		      pointcut = "ma.okteam.galopia.aop.SystemArchitecture.inDataAccessLayer()",
		      returning= "result")
	public void logExitDAOLayer(JoinPoint joinPoint, Object result) {
		if(LOG.isDebugEnabled()) {
			StringBuilder builder = new StringBuilder("End Executing ").
					append(joinPoint.getSignature().getDeclaringType().getSimpleName()).
					append(".").append(joinPoint.getSignature().getName());
			
			if(result != null) {
				builder.append(" with result ").append(result.toString());
			}
			LOG.debug(builder.toString());
		}
	}
	
}
