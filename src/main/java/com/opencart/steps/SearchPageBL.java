package com.opencart.steps;

import com.opencart.datamodel.FailSearchModel;
import com.opencart.datamodel.SearchModel;
import com.opencart.pages.SearchPage;
import com.opencart.repository.SearchModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class SearchPageBL {
    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL FailSearchProduct() {
        FailSearchModel failSearchModel = SearchModelRepository.getFailSearchModel();
        inputSearch(failSearchModel.getSearch());
        clickOnSearchButton();
        checkFailSearch();
        return this;
    }

    public SearchPageBL SearchByDescription() {
        SearchModel searchModel = SearchModelRepository.getSearchModel();
        inputSearch(searchModel.getSearch());
        clickOnDescriptionBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL SearchByWrongDescription() {
        FailSearchModel failSearchModel = SearchModelRepository.getFailSearchModel();
        inputSearch(failSearchModel.getSearch());
        clickOnDescriptionBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL SearchByCategories() {
        SearchModel searchModel = SearchModelRepository.getSearchModel();
        inputSearch(searchModel.getSearch());
        selectCategoriesChoice();
        clickOnSubcategoriesBox();
        clickOnSearchButton();
        return this;
    }

    public SearchPageBL SearchByWrongCategories() {
        FailSearchModel failSearchModel = SearchModelRepository.getFailSearchModel();
        inputSearch(failSearchModel.getSearch());
        selectCategoriesChoice();
        clickOnSubcategoriesBox();
        clickOnSearchButton();
        return this;
    }

    private void inputSearch(String search) {
        searchPage.getSearchInput().clear();
        searchPage.getSearchInput().sendKeys(search);
    }

    private void selectCategoriesChoice() {
        searchPage.getCategoriesChoice().click();
    }

    private void clickOnSubcategoriesBox() {
        new DriverUtils().clickOnElementJS(searchPage.getSubcategoriesBox());
    }

    private void clickOnDescriptionBox() {
        new DriverUtils().clickOnElementJS(searchPage.getDescriptionBox());
    }

    private void clickOnSearchButton() {
        searchPage.getSearchButton().click();
    }

    private void checkFailSearch() {searchPage.getFailSearch();}

    public void verifyUserSearchSuccess() {
        String expectedMessage = "Canon EOS 5D";
        Assert.assertEquals(searchPage.getSuccessSearch().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserSearchFail() {
        String expectedMessage = "There is no product that matches the search criteria.'";
        Assert.assertEquals(searchPage.getFailSearch().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserSearchByDescription() {
        String expectedMessage = "iPhone";
        Assert.assertEquals(searchPage.getSuccessSearchByDescription().getText(), expectedMessage, "Incorrect page title");
    }




}


