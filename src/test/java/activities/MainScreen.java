package activities;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class MainScreen {

    public Button addButton = new Button(By.id("com.android.contacts:id/floating_action_button"));

    public Label getConcatenatedName(String concatenatedName) {
        Label concatName = new Label(By.xpath("//android.widget.TextView[@resource-id='com.android.contacts:id/large_title' and @text='" + concatenatedName + "']"));
        return concatName;
    }

    public Label getPhoneNumber(String phoneNumber) {
        Label phoneNum = new Label (By.xpath("//android.widget.TextView[@resource-id=\"com.android.contacts:id/header\" and @text='"+ phoneNumber + "']"));
        return phoneNum;
    }

    public Label getEmail(String email) {
        Label emailLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.android.contacts:id/header\" and @text='"+ email + "']"));
        return emailLabel;
    }





}
