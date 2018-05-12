package appiumWork.functionalTests;

import appiumWork.BaseTest;
import appiumWork.screens.propertyFinderApp.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PFSearchApartmentsForRent extends BaseTest{

    MainPage mainPage;

    @AfterMethod
    public void backtoHome(){
        driver.resetApp();
    }

    @Test
    public void searchMin1BedroomApartmentInUAE(){
        mainPage = new MainPage(driver);
        mainPage.tapListOfCountries();
        mainPage.selectCountryFromDropdown("United Arab Emirates");
        mainPage.pressStartButton();

    }

}
