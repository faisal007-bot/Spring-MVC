package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

//requestmapping annotation can be applied on both controller class as well as handler method
//if applied on the controller then path of the handler method will be relative to the controller path
//else we can directly acces the path of the handler method
//@RequestMapping(path = "/project/")
@Controller
public class RedirectController {
	
//	@RequestMapping(path = "/redirectprefix")
//	public String redirectUsingPrefix() {
//		return "redirect:/form";
//	}
	
	@RequestMapping("/redirectprefix")
	public RedirectView redirectUsingRedirectView() {
		RedirectView view = new RedirectView();
		view.setUrl("https://www.google.com/search");
		return view;
	}
}
