package mapInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * 
9. Write a program to get the data from properties file.
 
 */
public class Question9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//mapInterface//objectrep.properties");
		Properties prop=new Properties();
		
		prop.load(fis);
		String username=prop.getProperty("UserName");
		String password=prop.getProperty("Password");
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
	}

}
