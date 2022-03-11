package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping(path = "/path/{id}/{name}")
	public String getPathVariable(@PathVariable("id")int id,
			@PathVariable("name")String name,Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "pathvariable";
	}
}
