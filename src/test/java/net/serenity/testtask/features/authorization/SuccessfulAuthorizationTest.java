package net.serenity.testtask.features.authorization;

import net.serenity.testtask.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SuccessfulAuthorizationTest {

    @Steps
    NavigationUser user;

    @Managed
    WebDriver driver;

    @Test
    public void successfulAuthorization() {
        String login = "test_acc_ip@testemail.org";
        String password = "890890";
        String expectedTitle = "Главная − интернет-бухгалтерия Моё дело";

        // 1
        user.openMainPage();

        // 2
        user.clickAuthorizationButton();

        // 3
        user.switchToNewWindow();

        // 4
        user.fillLoginInput(login);

        // 5
        user.fillPasswordInput(password);

        // 6
        user.clickEnterButton();

        // 7 Assert
        user.checkUserAtRightPage(expectedTitle);
    }
}
