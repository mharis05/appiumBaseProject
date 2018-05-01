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
    private ClockControlHoursScreen clockControlHoursScreen;
    private ClockControlMinutesScreen clockControlMinutesScreen;

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
        clockControlHoursScreen = new ClockControlHoursScreen(driver);
        clockControlMinutesScreen = new ClockControlMinutesScreen(driver);

        mainScreen.clickListItemViews();
        waitForSeconds(10);
        viewsScreen.clickListItemDateWidgets();
        waitForSeconds(10);
        dateWidgetsScreen.clickListItemInline();
        waitForSeconds(5);
        clockControlHoursScreen.dragToHour(3);
        waitForSeconds(5);
        clockControlMinutesScreen.dragToMinute(45);
        waitForSeconds(10);
    }
}
