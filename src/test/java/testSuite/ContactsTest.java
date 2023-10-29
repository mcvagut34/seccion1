package testSuite;

import activities.AddContactScreen;
import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ContactsTest {
    MainScreen mainScreen = new MainScreen();
    AddContactScreen addContactScreen = new AddContactScreen();

    @Test
    public void createNewTaskTest() {
        String name = "Moises";
        String lastName = "Valda";
        String phone = "(725)16557";
        String email = "mcvagut@gmail.com";

        String expectedFullName = name + " " + lastName;

        mainScreen.addButton.click();

        addContactScreen.firstNameTextBox.setText(name);
        addContactScreen.lastNameTextBox.setText(lastName);
        addContactScreen.phoneTextBox.setText(phone);
        addContactScreen.selectDeviceType.click();
        addContactScreen.mobileOption.click();

        addContactScreen.scrollDown(1500);

        addContactScreen.emailTextBox.setText(email);
        addContactScreen.selectEmailType.click();
        addContactScreen.emailOption.click();

        addContactScreen.saveButton.click();

        Assertions.assertTrue(mainScreen.getConcatenatedName(expectedFullName).isControlDisplayed());
        Assertions.assertTrue(mainScreen.getPhoneNumber(phone).isControlDisplayed());
        Assertions.assertTrue(mainScreen.getEmail(email).isControlDisplayed());
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }

}
