package controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import command.BinderCommand;

import entity.Address;
import entity.Point;

@Controller
@RequestMapping("/binder")
public class BinderController {

//	@Autowired
//	private PropertyEditorSupport dateEditor;
	
	@InitBinder
	public void init(WebDataBinder dataBinder){
		System.out.println("BinderController.init()");
		
		PropertyEditorSupport pointEditor=new PropertyEditorSupport(){
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				if(text==null||"".equals(text.trim())){
					return;
				}
				
				Point point=new Point();
				
				text=text.substring(1, text.length()-1);
				
				String[] s=text.split(",");
				
				point.setX(Double.parseDouble(s[0]));
				point.setY(Double.parseDouble(s[1]));
				
				setValue(point);
			}
			
			@Override
			public String getAsText() {
				Point point=(Point) getValue();
				return "("+point.getX()+","+point.getY()+")";
			}
		};
		
		dataBinder.registerCustomEditor(Point.class, pointEditor);
		
		
//		dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		
//		dataBinder.registerCustomEditor(Date.class, dateEditor);
		
	}
	
	
	@RequestMapping("/show")
	public String show(BinderCommand binderCommand){
		System.out.println("BinderController.show()");
		binderCommand.setUsername("abc");
		
		Point point=new Point();
		point.setX(4.0);
		point.setY(2.0);
		binderCommand.setPoint(point);
		
		Point p=new Point();
		p.setX(4.0);
		p.setY(2.0);
		binderCommand.setP(p);
		
		binderCommand.setBirthday(new Date());
		
		Address address=new Address();
		address.setProvince("江苏省");
		address.setCity("南京市");
		binderCommand.setAddress(address);
		
		return "binder";
	}
	
	@RequestMapping("/submit")
	public String submit(BinderCommand binderCommand,Errors errors){
		System.out.println("BinderController.submit()");
		if(errors.hasErrors()){
			return "binder";
		}
		
		System.out.println(binderCommand.getUsername());
		
		Point point=binderCommand.getPoint();
		if(point!=null){
			System.out.println(point.getX()+" "+point.getY());
		}
		
		Point p=binderCommand.getP();
		if(p!=null){
			System.out.println(p.getX()+" "+p.getY());
		}
		
		System.out.println(binderCommand.getBirthday());
		
		
		Address address=binderCommand.getAddress();
		if(address!=null){
			System.out.println(address.getProvince()+" "+address.getCity());
		}
		
		return "redirect:/binder/show";
	}
	
	public static void main(String[] args) {
//		String s="(5,3)";
//		
//		s.substring(1, s.length()-1);
//		
//		System.out.println(s);
//		Person p=new Person("abc");//1个字符串对象+1个Person对象
		String s1=new String("abc");//1				    2
		
		String s2="abc";//1/0						    0
		
		String s7="ab"+"c";	//2/0	.java->.class		0				
									//String s7="abc";
		
		String s3="ab";//0								1
		String s4="c";//0								1
		
		String s5=s3+s4;//0/1						    1	
//			String s5=new StringBuilder()
//				.append(s3)
//				.append(s4)
//				.toString();
		
		String s6=s1.substring(0, s1.length()-1);//0/1  1
		
		System.out.println(s3==s6);
		
	}
	
}
