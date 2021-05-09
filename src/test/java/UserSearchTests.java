import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserSearchTests extends BaseTest {
    @Test
    public void SearchWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchData("canon")
                .clickOnSearchButton();
        searchPageBL.verifyUserSearchSuccess();
    }

    @Test
    public void SearchWithInvalidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .inputSearchData("hgfjhj")
                .clickOnSearchButton();
        searchPageBL.verifyUserSearchFail();

    }

    @Test
    public void SearchByDescription() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchByDescription();
        searchPageBL.verifyUserSearchByDescription();
    }

    @Test
    public void SearchByCategories() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchByCategories();
        searchPageBL.verifyUserSearchSuccess();
    }

    @Test
    public void SearchByWrongDescription() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchByWrongDescription();
        searchPageBL.verifyUserSearchFail();
    }

    @Test
    public void SearchByWrongCategories() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchByWrongCategories();
        searchPageBL.verifyUserSearchFail();
    }
}


