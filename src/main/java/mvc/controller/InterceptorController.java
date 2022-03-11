package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

	@RequestMapping("/intercept")
	public String intercept() {
		return "interceptform";
	}
	
	@RequestMapping(path = "/interceptprocess",method = RequestMethod.POST)
	public String processInterceptor(@RequestParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("password")String password,Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "interceptsuccess";
	}
}
