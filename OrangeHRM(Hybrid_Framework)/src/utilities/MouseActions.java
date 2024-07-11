package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions {

	public static void RightClick(WebDriver driver, WebElement element) {
		UtilityObjects.Mouse(driver).contextClick(element).perform();
	}
	public static void DoubleClick(WebDriver driver, WebElement element) {
		UtilityObjects.Mouse(driver).doubleClick(element).perform();
	}
	public static void DargAndDrop(WebDriver driver, WebElement src, WebElement dst) {
		UtilityObjects.Mouse(driver).dragAndDrop(src, dst).perform();
	}
	public static void MouseHover(WebDriver driver, WebElement element) {
		UtilityObjects.Mouse(driver).moveToElement(element).perform();
	}
}
