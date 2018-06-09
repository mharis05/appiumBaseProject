package appiumWork.screens.propertyFinderApp;

import appiumWork.PageObject;
import appiumWork.screens.propertyFinderApp.locators.MainPageLocators;
import appiumWork.util.AppiumWaits;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import static appiumWork.steps.AndroidSteps.tap;

public class MainPage extends PageObject{

    public MainPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = MainPageLocators.countryDropdown)
    private AndroidElement dropDownCountrySelector;

    @AndroidFindBy(id = MainPageLocators.startButton)
    private AndroidElement startButton;

    public void tapListOfCountries() {tap(dropDownCountrySelector);
        AppiumWaits.sleepForSeconds(2);
    }

    public void selectCountryFromDropdown(String countryName){
        String countryPath = MainPageLocators.countryNameFromDropdown.replaceAll("country",countryName);
        AndroidElement countryElement = driver.findElement(By.xpath(countryPath));
        tap(countryElement);
        AppiumWaits.sleepForSeconds(4);
    }

    public void pressStartButton() {
        startButton = AppiumWaits.waitForVisibilityOfElement(startButton);
        tap(startButton);
        AppiumWaits.sleepForSeconds(5);
    }
}
