package control;

import io.appium.java_client.PerformsTouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class Control {

    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator = locator;
    }

    public void find(){
        this.control = Session.getSession().getDevice().findElement(this.locator);
    }

    public void click(){
        this.find();
        this.control.click();
    }

    public void scrollDown(int yOffset) {
        this.find();
        int startX = control.getLocation().getX();
        int startY = control.getLocation().getY();

        int endX = startX;
        int endY = startY + yOffset;

        TouchAction action = new TouchAction((PerformsTouchActions) Session.getSession().getDevice());
        action.press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public void type(String value){
        this.find();
        this.control.sendKeys(value);
    }

    public String getText(){
        find();
        return control.getText();
    }

    public Boolean isControlDisplayed(){
        try {
            find();
            return control.isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void clear(){
        this.find();
        this.control.clear();
    }

    public void submit(){
        this.find();
        this.control.submit();
    }

    public void waitTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
