package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBox extends Control{

    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value){
        find();
        control.sendKeys(value);
    }


    public void clearSetText(String value){
        find();
        control.clear();
        control.sendKeys(value);
    }

    public void setTextEnter(String value){
        find();
        control.sendKeys(value+ Keys.ENTER);
    }
}
