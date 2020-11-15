package net.serenity.testtask.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl(value = "https://www.moedelo.org/")
public class MainPage extends PageObject {

    @FindBy(css = "#login_auth")
    private WebElement authorizationButton;

    public void clickAuthorizationButton() {
        authorizationButton.click();
    }

}
