package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement searchInput;

    @FindBy(name = "category_id")
    private WebElement categoriesChoice;

    @FindBy(xpath = ".//*[contains(@name,'sub_category')]")
    private WebElement subcategoriesBox;

    @FindBy(xpath = ".//*[contains(@name,'description')]")
    private WebElement descriptionBox;

    @FindBy(id = "button-search")
    private WebElement searchButton;

    @FindBy(xpath = ".//div[@class='caption']/h4/a[text()='Canon EOS 5D']")
    private WebElement successSearch;

    @FindBy(xpath = ".//*[text()='There is no product that matches the search criteria.']")
    private WebElement failSearch;

    @FindBy(xpath = ".//div[@class='caption']/h4/a[text()='iPhone']")
    private WebElement successSearchByDescription;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public Select getCategoriesChoice() {
       return new Select(driver.findElement(By.name("category_id")));
    }

   public WebElement getSubcategoriesBox() {
        return subcategoriesBox;
    }

    public WebElement getDescriptionBox() {
        return descriptionBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSuccessSearch() {
        return successSearch;
    }

    public WebElement getFailSearch() {
        return failSearch;
    }

    public WebElement getSuccessSearchByDescription() {return successSearchByDescription;}
}
