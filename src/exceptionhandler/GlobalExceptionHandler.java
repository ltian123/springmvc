package exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public String exceptionHandler(Exception e){
		System.out.println("GlobalExceptionHandler.exceptionHandler()");
		return "error";
	}
}
