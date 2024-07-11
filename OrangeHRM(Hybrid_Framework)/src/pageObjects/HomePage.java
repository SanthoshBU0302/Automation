package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement logoutdrop;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//span[.='PIM']")
	private WebElement pimbtn;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addempbtn;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fnTF;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lnTF;
	
	@FindBy(xpath="//button[.=' Save ']")
	private WebElement savebtn;
	
	@FindBy(xpath="//span[.='Leave']")
	private WebElement leavebtn;
	
	@FindBy(xpath="//a[.='Apply']")
	private WebElement applybtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement logoutdrop() {
		return logoutdrop;
	}

	public WebElement logout() {
		return logoutbtn;
	}
	public WebElement click_pim() {
		return pimbtn;
	}
	public WebElement click_addemp() {
		return addempbtn;
	}
	public WebElement addFN() {
		return fnTF;
	}
	public WebElement addLN() {
		return lnTF;
	}
	public WebElement save()
	{
		return savebtn;
	}
	public WebElement click_leave()
	{
		return leavebtn;
	}
	public WebElement apply_leave()
	{
		return applybtn;
	}
}
