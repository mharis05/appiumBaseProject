package appiumWork.functionalTests;

import appiumWork.BaseTest;
import appiumWork.screens.*;
import org.testng.annotations.Test;


import static appiumWork.util.AppiumWaits.waitForSeconds;

public class InitialTests extends BaseTest {

    private MainScreen mainScreen;
    private ViewsScreen viewsScreen;
    private ExpandableListsScreen expandableListsScreen;
    private CustomAdapterScreen customAdapterScreen;
    private DateWidgetsScreen dateWidgetsScreen;
    private ClockControlScreen clockControlScreen;

    @Test
    public void navigateToCustomAdapterAndLongPressOnPropleNames(){

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

    }


    @Test
    public void clockControlSetTest(){
        //System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().class(\"android.widget.TextView\")").size());

        mainScreen = new MainScreen(driver);
        viewsScreen = new ViewsScreen(driver);
        dateWidgetsScreen = new DateWidgetsScreen(driver);
        clockControlScreen = new ClockControlScreen(driver);

        mainScreen.clickListItemViews();
        waitForSeconds(10);
        viewsScreen.clickListItemDateWidgets();
        waitForSeconds(10);
        dateWidgetsScreen.clickListItemInline();
        waitForSeconds(5);
        clockControlScreen.dragToHour(3);


    }
}
