package appiumWork.functionalTests;

import appiumWork.BaseTest;
import appiumWork.screens.CustomAdapterScreen;
import appiumWork.screens.ExpandableListsScreen;
import appiumWork.screens.MainScreen;
import appiumWork.screens.ViewsScreen;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static appiumWork.util.AppiumWaits.waitForSeconds;

public class InitialTests extends BaseTest {

    private MainScreen mainScreen;
    private ViewsScreen viewsScreen;
    private ExpandableListsScreen expandableListsScreen;
    private CustomAdapterScreen customAdapterScreen;

    @Test
    public void performTestsForXPathAndId(){

        mainScreen = new MainScreen(driver);
        viewsScreen = new ViewsScreen(driver);
        expandableListsScreen = new ExpandableListsScreen(driver);
        customAdapterScreen = new CustomAdapterScreen(driver);

        mainScreen.clickListItemViews();
        waitForSeconds(10);
        viewsScreen.clickListItemExpandableLists();
        waitForSeconds(10);
        expandableListsScreen.clickCustomAdaperListItem();
        waitForSeconds(10);
        customAdapterScreen.tapAndHoldListItemPeopleNames(2);
        waitForSeconds(10);

/*        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementById("android:id/checkbox").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();*/

    }


    @Test
    public void performTestsForUIAutomator(){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().class(\"android.widget.TextView\")").size());
    }
}
