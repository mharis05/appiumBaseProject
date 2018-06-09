package appiumWork.screens.propertyFinderApp;

import appiumWork.PageObject;
import appiumWork.screens.propertyFinderApp.locators.FiltersPageLocators;
import appiumWork.screens.propertyFinderApp.locators.SearchResultsPageLocators;
import appiumWork.util.AppiumWaits;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static appiumWork.steps.AndroidSteps.tap;

public class FiltersPage extends PageObject{

    public FiltersPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = FiltersPageLocators.minBedroomsSpinner)
    private AndroidElement minBedroomsSpinner;

    public void tapMinBedroomsSpinner(){
        minBedroomsSpinner = AppiumWaits.waitForVisibilityOfElement(minBedroomsSpinner);
        tap(minBedroomsSpinner);
        AppiumWaits.sleepForSeconds(2);
    }


}
