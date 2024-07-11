package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.UtilityObjects;

public class Dropdown {
public void selectoption(WebElement element, Object Data)
{
	Select so=UtilityObjects.DropDown(element);
	if(Data instanceof Integer)
	{
		so.selectByIndex((Integer)Data);
	}
	else if(Data instanceof String)
	{
		try {
			so.selectByValue((String)Data);
		} catch (Exception e) {
			so.selectByVisibleText((String)Data);
			}
	}
}
public void Deselectoption(WebElement element)
{
	Select dso=UtilityObjects.DropDown(element);
	dso.deselectAll();
}
}
