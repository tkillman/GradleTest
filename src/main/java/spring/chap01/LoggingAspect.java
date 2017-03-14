package spring.chap01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {

	private Log log = LogFactory.getLog(getClass());

	//ProceedingJoinPoint�� proxy�� ����ä�� �޼ҵ� ������ ������.
	
	
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("��� ����");
		StopWatch stopWatch = new StopWatch();

		try {
			stopWatch.start();
			
			//proceed �޼ҵ带 �����Ű�� ProceedingJoinPoint�� ����� �޼ҵ带 �����Ų��.
			//write()�� �����Ų��.
			//���� �߻��� catch�������� �ƴϸ� retValue�� return
			
			Object retValue = joinPoint.proceed();
			
			return retValue;

		} catch (Throwable e ) {
			throw e;
		} finally {
			stopWatch.stop();
			log.info("��� ����");
			log.info(joinPoint.getSignature().getName() + "���� �ð� " + stopWatch.getTotalTimeMillis());

		}

	
	}

}
