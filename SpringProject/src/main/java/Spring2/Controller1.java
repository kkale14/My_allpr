package Spring2;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Controller1 {

	@ExceptionHandler(value=Exception.class)
	public String get()
	{
		return "error";
	}

//	@ExceptionHandler(value=IOException.class)
//	public String get1()
//	{
//		return "error";
//	}
	
	
}
