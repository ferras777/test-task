package net.serenity.testtask.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends PageObject {

    @FindBy(css = "[type=\"email\"]")
    private WebElement loginInput;

    @FindBy(css = "[type=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//span[text()=\"Войти в сервис\"]")
    private WebElement enterButton;

    public void fillLogin(String login) {
        loginInput.sendKeys(login);
    }

    public void fillPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickEnterButton() {
        enterButton.click();
    }
}
