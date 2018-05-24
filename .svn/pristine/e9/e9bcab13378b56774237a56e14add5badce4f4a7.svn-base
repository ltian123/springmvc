package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/upload")
	public String upload(@RequestParam("file") CommonsMultipartFile file,HttpSession session) throws Exception {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		ServletContext application=session.getServletContext();
		
		String uploadDir=application.getRealPath("WEB-INF/upload");
		
		file.transferTo(new File(uploadDir,file.getOriginalFilename()));
		
		return "upload";
	}
}
