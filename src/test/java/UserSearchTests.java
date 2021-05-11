import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserSearchTests extends BaseTest {
    @Test
    public void searchWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchData("canon")
                .clickOnSearchButton();
        searchPageBL.verifyUserSearchSuccess();
    }

    @Test
    public void searchWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchData("hgfjhj")
                .clickOnSearchButton();
        searchPageBL.verifyUserSearchFail();

    }

    @Test
    public void searchByDescription() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .searchByDescription();
        searchPageBL.verifyUserSearchByDescription();
    }

    @Test
    public void searchByCategories() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .searchByCategories();
        searchPageBL.verifyUserSearchSuccess();
    }

    @Test
    public void searchByWrongDescription() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .searchByWrongDescription();
        searchPageBL.verifyUserSearchFail();
    }

    @Test
    public void searchByWrongCategories() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .searchByWrongCategories();
        searchPageBL.verifyUserSearchFail();
    }
}


