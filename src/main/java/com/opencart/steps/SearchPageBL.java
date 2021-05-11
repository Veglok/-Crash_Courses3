package com.opencart.steps;

import com.opencart.pages.SearchPage;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class SearchPageBL {
    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL searchByDescription() {
        inputSearch("new mobile phone");
        clickOnDescriptionBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL searchByWrongDescription() {
        inputSearch("ghkfhg");
        clickOnDescriptionBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL searchByCategories() {
        inputSearch("canon");
        selectCategoriesChoice("Cameras");
        clickOnSubcategoriesBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL searchByWrongCategories() {
        inputSearch("canon");
        selectCategoriesChoice("Tablets");
        clickOnSubcategoriesBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL inputSearch(String search) {
        searchPage.getSearchInput().clear();
        searchPage.getSearchInput().sendKeys(search);
        return this;
    }

    private void selectCategoriesChoice(String category) {
        searchPage.getCategoriesChoice().selectByVisibleText(category);
    }

    private void clickOnSubcategoriesBox() {
        new DriverUtils().clickOnElementJS(searchPage.getSubcategoriesBox());
    }

    private void clickOnDescriptionBox() {
        new DriverUtils().clickOnElementJS(searchPage.getDescriptionBox());
    }

    public SearchPageBL clickOnSearchButton() {
        searchPage.getSearchButton().click();
        return this;
    }

    public void verifyUserSearchSuccess() {
        String expectedMessage = "Canon EOS 5D";
        Assert.assertEquals(searchPage.getSuccessSearch().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserSearchFail() {
        String expectedMessage = "There is no product that matches the search criteria.";
        Assert.assertEquals(searchPage.getFailSearch().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserSearchByDescription() {
        String expectedMessage = "iPhone";
        Assert.assertEquals(searchPage.getSuccessSearchByDescription().getText(), expectedMessage, "Incorrect page title");
    }




}


