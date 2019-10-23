package testStepsDefinition;




import java.util.Date;

import org.apache.commons.*;
import org.apache.commons.lang3.RandomStringUtils;



public class javascript {

	public static void main(String[] args) {

		
	//	string name = Math.random().toString(36).substring(2, 16) + Math.random().toString(36).substring(2, 16)).toUpperCase();
System.out.println(RandomStringUtils.randomAlphabetic(10).toUpperCase());
System.out.println(RandomStringUtils.randomNumeric(10));
String name = "anjita";
System.out.println(name.length());

Date d = new Date();
System.out.println(d.toString().replace(":","_").replace(" ", "_"));

	}

}
 