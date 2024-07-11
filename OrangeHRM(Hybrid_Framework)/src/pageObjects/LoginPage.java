package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usnTF;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pswTF;

	@FindBy(xpath = "//button[.=' Login ']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement usernameTF() {
		return usnTF;
	}

	public WebElement passwordTF() {
		return pswTF;
	}

	public WebElement loginButton() {
		return loginbtn;
	}

}
