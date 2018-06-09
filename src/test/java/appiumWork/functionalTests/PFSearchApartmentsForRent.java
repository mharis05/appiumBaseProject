package appiumWork.functionalTests;

import appiumWork.BaseTest;
import appiumWork.screens.propertyFinderApp.FiltersPage;
import appiumWork.screens.propertyFinderApp.MainPage;
import appiumWork.screens.propertyFinderApp.SearchResultsPage;
import appiumWork.util.AppiumWaits;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PFSearchApartmentsForRent extends BaseTest{

    private MainPage mainPage;
    private FiltersPage filtersPage;
    private SearchResultsPage searchResultsPage;

    @AfterMethod
    public void backtoHome(){
        driver.resetApp();
    }

    @Test
    public void searchMin1BedroomApartmentInUAE(){
        mainPage = new MainPage(driver);
        mainPage.tapListOfCountries();
        mainPage.selectCountryFromDropdown("Qatar");
        mainPage.tapListOfCountries();
        mainPage.selectCountryFromDropdown("United Arab Emirates");
        mainPage.pressStartButton();

        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.tapFilters();
        AppiumWaits.sleepForSeconds(3);

        filtersPage = new FiltersPage(driver);
        filtersPage.tapMinBedroomsSpinner();
        AppiumWaits.sleepForSeconds(1);



    }

}
