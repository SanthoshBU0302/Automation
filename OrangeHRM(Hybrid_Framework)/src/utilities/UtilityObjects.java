package utilities;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityObjects {

	public static Actions Mouse(WebDriver driver) {
		Actions act = new Actions(driver);
		return act;
	}

	public static Select DropDown(WebElement element) {
		Select d = new Select(element);
		return d;
	}

	public static JavascriptExecutor JSE(WebDriver driver) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		return j;
	}

	public static Robot KeyBoard() throws Exception {
		Robot r = new Robot();
		return r;
	}

}
