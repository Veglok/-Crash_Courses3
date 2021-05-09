package com.opencart.steps;

import com.opencart.pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL inputSearchData(String searchPhrase) {
        headerPage.getSearchField().clear();
        headerPage.getSearchField().sendKeys(searchPhrase);
        return this;
    }

    public SearchPageBL clickOnSearchButton() {
        headerPage.getSearchButton().click();
        return new SearchPageBL();
    }


}
