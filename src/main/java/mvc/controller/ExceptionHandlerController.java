package mvc.controller;

//import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHandlerController {
	
//	@SuppressWarnings("null")
	@RequestMapping("/exception")
	public String exceptionTest() {
		
//		below line will generate null pointer exception	
//		String name = null;
//		System.out.println(name.length());
		
//		below line will generate number format exception
//		String name = "faisal";
//		Integer number = Integer.valueOf(name);
//		System.out.println(number);
		
		return "form";
	}
	
//	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	public String ExceptionHandler() {
//		return "exception";
//	}
//	
//	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(Exception.class)
//	public String genericExceptionHandler() {
//		return "exception";
//	}
}
