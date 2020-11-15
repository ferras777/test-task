package net.serenity.testtask.steps;

import net.serenity.testtask.ui.AuthorizationPage;
import net.serenity.testtask.ui.CurrentPage;
import net.serenity.testtask.ui.MainPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class NavigationUser {

    MainPage mainPage;
    AuthorizationPage authorizationPage;
    CurrentPage currentPage;

    @Step(value = "Open main page")
    public void openMainPage() {
        mainPage.open();
    }

    @Step(value = "Click authorization button")
    public void clickAuthorizationButton() {
        mainPage.clickAuthorizationButton();
    }

    @Step(value = "Fill login input")
    public void fillLoginInput(String login) {
        authorizationPage.fillLogin(login);
    }

    @Step(value = "Fill password input")
    public void fillPasswordInput(String password) {
        authorizationPage.fillPassword(password);
    }

    @Step(value = "Click enter button")
    public void clickEnterButton() {
        authorizationPage.clickEnterButton();
    }

    @Step(value = "Switch to new window")
    public void switchToNewWindow() {
        WebDriver driver = mainPage.getDriver();
        String baseWindowHandle = driver.getWindowHandle();
        Set<String> openedWindows = driver.getWindowHandles();
        String newWindow = null;
        if (openedWindows.size() > 1 && openedWindows.remove(baseWindowHandle)) {
            Iterator<String> openedWindowsIterator = openedWindows.iterator();
            newWindow = (String) openedWindowsIterator.next();
        }
        driver.switchTo().window(newWindow);
    }

    @Step(value = "Check user at right page")
    public void checkUserAtRightPage(String title) {
        assertEquals(currentPage.getTitle(), title);
    }
}
