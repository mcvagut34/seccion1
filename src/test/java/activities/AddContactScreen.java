package activities;

import control.Button;
import control.Select;
import control.TextBox;
import org.openqa.selenium.By;

public class AddContanctScreen {
    public TextBox firstNameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));

    public TextBox lastNameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Last name\"]"));

    public TextBox phoneTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));

    public Select selectDeviceType = new Select(By.xpath("//android.widget.Spinner[@content-desc=\"Phone\"]"));

    public Select mobileOption = new Select(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mobile\"]"));

    public TextBox emailTextBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Email\"]"));

    public Select selectEmailType = new Select(By.xpath("//android.widget.Spinner[@content-desc=\"Email\"]"));

    public Select emailOption = new Select(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Home\"]"));

    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));



}
