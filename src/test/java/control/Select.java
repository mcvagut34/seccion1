package control;

import org.openqa.selenium.By;

public class Select extends Control{
    public Select(By locator) {
        super(locator);
    }

    public void selectByVisibleText(String visibleText) {
        find();
        control.sendKeys(visibleText);
    }

    public void selectByValue(String value) {
        find();
        control.sendKeys(value);
    }

}
