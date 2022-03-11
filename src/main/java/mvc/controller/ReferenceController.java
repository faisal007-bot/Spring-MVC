package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.model.Student;

@Controller
public class ReferenceController {

	@RequestMapping("/ref")
	public String referenceForm() {
		return "ref";
	}
	
	@RequestMapping(path = "/refprocess",method = RequestMethod.POST)
	public String refProcess(@ModelAttribute("student")Student student) {
		return "refdata";
	}
}
