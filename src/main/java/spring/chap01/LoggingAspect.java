package spring.chap01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {

	private Log log = LogFactory.getLog(getClass());

	//ProceedingJoinPoint는 proxy로 가로채온 메소드 정보를 가진다.
	
	
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("기록 시작");
		StopWatch stopWatch = new StopWatch();

		try {
			stopWatch.start();
			
			//proceed 메소드를 실행시키면 ProceedingJoinPoint에 저장된 메소드를 실행시킨다.
			//write()를 실행시킨다.
			//예외 발생시 catch구문으로 아니면 retValue를 return
			
			Object retValue = joinPoint.proceed();
			
			return retValue;

		} catch (Throwable e ) {
			throw e;
		} finally {
			stopWatch.stop();
			log.info("기록 종료");
			log.info(joinPoint.getSignature().getName() + "실행 시간 " + stopWatch.getTotalTimeMillis());

		}

	
	}

}
