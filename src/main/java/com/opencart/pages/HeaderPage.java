package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    @FindBy(name = "search")
    private WebElement SearchField;

    @FindBy(xpath = ".//*[@class= 'btn btn-default btn-lg']")
    private WebElement SearchButton;

    public WebElement getSearchField() {
        return SearchField;
    }

    public WebElement getSearchButton() {
        return SearchButton;
    }


}
