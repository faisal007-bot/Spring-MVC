package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.ComplexUser;

@Controller
public class ComplexController {
	
	@RequestMapping("/complex")
	public String complexForm() {
		return "complexform";
	}
	
	@RequestMapping(path = "/complexprocess",method = RequestMethod.POST)
	public String processComplexForm(@ModelAttribute("complexuser")ComplexUser user) {
		return "complexdata";
	}
}
