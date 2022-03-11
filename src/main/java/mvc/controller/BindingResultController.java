package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.MyNumber;

@Controller
public class BindingResultController {

	@RequestMapping("/bind")
	public String getForm() {
		return "binding";
	}
	
	@RequestMapping(path = "/bindprocess",method = RequestMethod.POST)
	public String checkBinding(@ModelAttribute("number")MyNumber number,BindingResult result) {
		if(result.hasErrors()) {
			return "binderror";
		}
		return "bindsuccess";
	}
}
