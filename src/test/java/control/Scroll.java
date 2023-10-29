package control;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import session.Session;
@SuppressWarnings("deprecation")
public class Scroll extends Control{
    public Scroll(By locator) {
        super(locator);
    }
    public void scrollDown(int yOffset) {
        AndroidDriver driver = (AndroidDriver) Session.getSession().getDevice();
        Dimension dimensions = driver.manage().window().getSize();
        int startY = (int) (dimensions.getHeight() * 0.5);
        int endY = startY - yOffset;

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(0, startY)).moveTo(PointOption.point(0, endY)).release().perform();
    }
}
