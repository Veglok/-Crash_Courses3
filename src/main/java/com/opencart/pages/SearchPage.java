package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement SearchInput;

    @FindBy(name = "category_id")
    private WebElement CategoriesChoice;

    @FindBy(xpath = ".//*[contains(@name,'sub_category')]")
    private WebElement SubcategoriesBox;

    @FindBy(xpath = ".//*[contains(@name,'description')]")
    private WebElement DescriptionBox;

    @FindBy(id = "button-search")
    private WebElement SearchButton;

    @FindBy(xpath = ".//div[@class='caption']/h4/a[text()='Canon EOS 5D']")
    private WebElement SuccessSearch;

    @FindBy(xpath = ".//*[text()='There is no product that matches the search criteria.']")
    private WebElement FailSearch;

    @FindBy(xpath = ".//div[@class='caption']/h4/a[text()='iPhone']")
    private WebElement SuccessSearchByDescription;

    public WebElement getSearchInput() {
        return SearchInput;
    }

    public WebElement getCategoriesChoice() {
        Select category = new Select(driver.findElement(By.name("category_id")));
        category.selectByVisibleText("Cameras");
        return CategoriesChoice;
    }

   public WebElement getSubcategoriesBox() {
        return SubcategoriesBox;
    }

    public WebElement getDescriptionBox() {
        return DescriptionBox;
    }

    public WebElement getSearchButton() {
        return SearchButton;
    }

    public WebElement getSuccessSearch() {
        return SuccessSearch;
    }

    public WebElement getFailSearch() {
        return FailSearch;
    }

    public WebElement getSuccessSearchByDescription() {return SuccessSearchByDescription;}
}
