package base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.LoginPage;
import pageObjects.HomePage;

public class Base_Script implements ApplicationConstants {
	public static WebDriver driver;
//	Properties pro;
	public ReadProperties prop;
	public HomePage hp;
	public FileInputStream fis;
	public WebDriverWait ew;

	@BeforeClass
	public void launchBrowser() throws Exception {
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		FileInputStream fis=new FileInputStream("./TestProperties/TestData.properties");
//		pro=new Properties();
//		pro.load(fis);
//		driver.get(pro.getProperty("testurl"));
//		prop = new ReadProperties();
//		driver.get(prop.url());
		driver.get(fetchProperties.getprop("testurl"));
		hp = new HomePage(driver);
		ew=new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void login() {
		LoginPage lp = new LoginPage(driver);
//		lp.usernameTF().sendKeys(prop.usn());
//		lp.passwordTF().sendKeys(prop.psw());
		ew.until(ExpectedConditions.visibilityOf(lp.usernameTF()));
		lp.usernameTF().sendKeys(fetchProperties.getprop("testuser"));
		ew.until(ExpectedConditions.visibilityOf(lp.passwordTF()));
		lp.passwordTF().sendKeys(fetchProperties.getprop("testpsw"));
		ew.until(ExpectedConditions.elementToBeClickable(lp.loginButton()));
		lp.loginButton().click();
	}

	@AfterMethod
	public void logout(ITestResult result) {
		if(result.FAILURE==result.getStatus())
		{
			CaptureDefects.GetDefects(result.getName());
		}
		ew.until(ExpectedConditions.elementToBeClickable(hp.logoutdrop()));
		hp.logoutdrop().click();
		ew.until(ExpectedConditions.elementToBeClickable(hp.logout()));
		hp.logout().click();

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		System.out.println("Logged out Successfully");
	}

}
