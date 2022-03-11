package mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerToViewData {

//	sending data from controller to view using model 
	@RequestMapping("/datatoview1")
	public String toView(Model model) {
		List<String> friends = new ArrayList<String>();
		friends.add("faisal");
		friends.add("deadeye");
		friends.add("neko");
		friends.add("cipher");
		model.addAttribute("id", 007);
		model.addAttribute("name", "faisal khan");
		model.addAttribute("friends", friends);
		return "view1";
	}
	
	
//	sending data from controller to view using modelandview
	@RequestMapping("/datatoview2")
	public ModelAndView toView2(ModelAndView modelAndView) {
		List<String> friends = new ArrayList<String>();
		friends.add("faisal");
		friends.add("deadeye");
		friends.add("neko");
		friends.add("cipher");
		modelAndView.addObject("id", 007);
		modelAndView.addObject("name", "faisal khan");
		modelAndView.addObject("friends", friends);
		modelAndView.setViewName("view2");
		return modelAndView;
	}
}
