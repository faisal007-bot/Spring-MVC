package mvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@RequestMapping("/fileform")
	public String fileForm() {
		return "fileform";
	}
	
	@RequestMapping(path = "/processfile",method = RequestMethod.POST)
	public String processFile(@RequestParam("profile")CommonsMultipartFile file,
			HttpSession session,Model model) {
		
//		this is used to get the path where we want to save the file we are going to recieve from 
//		the client
		String path = session.getServletContext().getRealPath("")+"WEB-INF"+File.separator+
				"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		
		
//		some of the common file related methods 
//		to get the metadata of the file which is being recieved
//		System.out.println(file.getContentType());
//		System.out.println(file.getName());
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.getStorageDescription());
//		System.out.println(file.getFileItem());
		
		
//		saving file using output stream
		byte[] fileData = file.getBytes();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(fileData);
			model.addAttribute("fileData", file.getOriginalFilename());
			fos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "showfile";
	}
}
