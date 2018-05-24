package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@Controller
@RequestMapping("/code")
public class CodeController {
	
	@RequestMapping("/getImage")
	public void getImage(OutputStream out,HttpSession session) throws Exception {
		
		Random random=new Random();
		
		BufferedImage image=new BufferedImage(75, 35, BufferedImage.TYPE_INT_RGB);
		
		Graphics graphics=image.getGraphics();
		
		graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
		
		graphics.fillRect(0, 0, 75, 35);
		 
		graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
		
		graphics.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC,18));
		
		String s="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		StringBuffer code=new StringBuffer();
		
		for (int i = 0; i < 5; i++) {
			int index=random.nextInt(s.length());
			code.append(s.charAt(index));
		}
		
		session.setAttribute("code", code.toString());
		
		graphics.drawString(code.toString(), 5, 20);
		
		for (int i = 0; i < 3; i++) {
			graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
			graphics.drawLine(random.nextInt(76), random.nextInt(36), random.nextInt(76), random.nextInt(36));
		}
		
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		
	}
	
	@RequestMapping(value="/validateCode",produces="text/plain;charset=utf-8")
	public @ResponseBody String validateCode(String code,HttpSession session){
		String sessionCode=(String) session.getAttribute("code");
		if(sessionCode!=null&&sessionCode.equalsIgnoreCase(code)){
			return "验证码正确";
		}
		return "验证码错误";
	}
	
	
	
}
