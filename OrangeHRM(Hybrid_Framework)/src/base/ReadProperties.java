package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties implements ApplicationConstants{
	public Properties pro;

	public ReadProperties() throws Exception {
		pro = new Properties();
		FileInputStream fis = new FileInputStream(prop_path);
		pro.load(fis);
	}

	public String url() {
		return pro.getProperty("testurl");
	}

	public String usn() {
		return pro.getProperty("testuser");
	}

	public String psw() {
		return pro.getProperty("testpsw");
	}

}
