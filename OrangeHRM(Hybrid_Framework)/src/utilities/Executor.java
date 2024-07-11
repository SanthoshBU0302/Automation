package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executor {
	public static void ClickAction(WebDriver driver, WebElement element)
	{
		UtilityObjects.JSE(driver).executeScript("arguments[0].click();", element);
	}
	public static void ScrollAction(WebDriver driver, WebElement element)
	{
		UtilityObjects.JSE(driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	public static void PassData(WebDriver driver, WebElement element, String Data)
	{
		UtilityObjects.JSE(driver).executeScript("arguments[0].value='"+Data+"'", element);
	}

}
