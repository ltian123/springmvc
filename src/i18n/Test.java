package i18n;

import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args) throws IOException {
//		Date date=new Date();
//		
//		System.out.println(date);
//		
//		DateFormat format=DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
//		
//		System.out.println(format.format(date));
//		
//		
////		Locale locale=Locale.getDefault();
////		
////		
////		System.out.println(locale.getCountry()+" "+locale.getLanguage());
//		
//		
//		Locale[] locales=Locale.getAvailableLocales();
//		
//		for (Locale locale : locales) {
//			System.out.println(locale.getCountry()+" "+locale.getLanguage());
//			
//		}
//		
//		
		double d=12312312423432.23;
		
		NumberFormat format=NumberFormat.getNumberInstance();
		
		System.out.println(format.format(d));
		
		format=NumberFormat.getCurrencyInstance();
		
		System.out.println(format.format(d));
		
		
		
//		Properties p=new Properties();
//		p.load(Test.class
//				   .getClassLoader()
//				   .getResourceAsStream("i18n/resource.properties"));		
//		
//		System.out.println(p.getProperty("a"));
		
		
		
//		ResourceBundle rb=ResourceBundle.getBundle("i18n/resource");
//		ResourceBundle rb=ResourceBundle.getBundle("i18n.resource");
//		
//		String a=rb.getString("a");
//		
//		System.out.println(a);
		
	}
}
