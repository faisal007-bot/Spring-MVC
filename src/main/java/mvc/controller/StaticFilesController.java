package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticFilesController {

	@RequestMapping("/static")
	public String showForm() {
		return "staticform";
	}
}
