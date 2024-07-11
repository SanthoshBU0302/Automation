package base;

import java.io.FileInputStream;
import java.util.Properties;

public class fetchProperties implements ApplicationConstants{
	public static Properties pro;
	static {
		pro = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(prop_path);
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

//	public static String url() {
//		return pro.getProperty("testurl");
//	}
//
//	public static String usn() {
//		return pro.getProperty("testuser");
//	}
//
//	public static String psw() {
//		return pro.getProperty("testpsw");
//	}
	public static String getprop(String Key) {
		return pro.getProperty(Key);
	}

}
