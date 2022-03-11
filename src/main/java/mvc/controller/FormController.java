package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import mvc.model.User;

@Controller
public class FormController {

//	@SuppressWarnings("null")
	@RequestMapping("/form")
	public String showForm() {
		
//		used this code for verification of the worling of centralixed exception handling
//		String name = null;
//		System.out.println(name.length());
		
		return "form";
	}
	
//	fetching data using requestparam
//	@RequestMapping(path = "/process",method = RequestMethod.POST)
//	public String processForm(@RequestParam("email")String email,
//			@RequestParam("password")String password,Model model) {
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//		if(email.contains("@")&&(!(password.isBlank()))) {
//			return "success";
//		}
//		return "error";
//	}
	
	@RequestMapping(path = "/process",method = RequestMethod.POST)
	public String processForm(@ModelAttribute("user")User user) {
		if(user.getEmail().contains("@")&&(!(user.getPassword().isBlank()))) {
			return "success";
		}
		return "error";
	}
}
