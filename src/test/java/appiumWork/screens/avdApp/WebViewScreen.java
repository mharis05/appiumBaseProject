package appiumWork.screens.avdApp;

import appiumWork.AppiumAssertions;
import appiumWork.PageObject;
import appiumWork.screens.avdApp.locators.WebViewLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WebViewScreen extends PageObject{

    public WebViewScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    AppiumAssertions validate = new AppiumAssertions();

    @AndroidFindBy(xpath = WebViewLocators.textHelloWorld)
    private AndroidElement webViewText;

    public void validateWebViewContent(){
        validate.validateWebViewContentAgainstString(webViewText.getAttribute("name"),"Hello World! - 1");
        validate.performAllAssertions();
    }
}
