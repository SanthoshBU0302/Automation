package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.Base_Script;
import base.ReadExcel;

public class Testcase01 extends Base_Script {
	WebDriver driver;

	@Test
	public void test01() throws Exception {
		ew.until(ExpectedConditions.elementToBeClickable(hp.click_pim()));
		hp.click_pim().click();
		ew.until(ExpectedConditions.elementToBeClickable(hp.click_addemp()));
		hp.click_addemp().click();
		ew.until(ExpectedConditions.visibilityOf(hp.addFN()));
		hp.addFN().sendKeys(ReadExcel.readdata("sheet1", 0, 0));
		ew.until(ExpectedConditions.visibilityOf(hp.addLN()));
		hp.addLN().sendKeys(ReadExcel.readdata("sheet1", 0, 1));
		ew.until(ExpectedConditions.elementToBeClickable(hp.save()));
		hp.save().click();
	}

	@Test(priority = 1)
	public void test02() {
		ew.until(ExpectedConditions.elementToBeClickable(hp.click_leave()));
		hp.click_leave().click();
		ew.until(ExpectedConditions.elementToBeClickable(hp.apply_leave()));
		hp.apply_leave().click();
	}

}
