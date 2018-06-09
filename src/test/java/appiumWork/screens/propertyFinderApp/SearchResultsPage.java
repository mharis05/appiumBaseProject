package appiumWork.screens.propertyFinderApp;

import appiumWork.PageObject;
import appiumWork.screens.propertyFinderApp.locators.SearchResultsPageLocators;
import appiumWork.util.AppiumWaits;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static appiumWork.steps.AndroidSteps.tap;

public class SearchResultsPage extends PageObject {
    public SearchResultsPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = SearchResultsPageLocators.filtersLabel)
    private AndroidElement filters;

    public void tapFilters(){
        filters = AppiumWaits.waitForVisibilityOfElement(filters);
        tap(filters);
        AppiumWaits.sleepForSeconds(3);
    }
}
