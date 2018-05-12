package appiumWork.functionalTests;

import appiumWork.BaseTest;
import appiumWork.screens.avdApp.*;
import org.testng.annotations.AfterMethod;
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
    private WebViewScreen webViewScreen;
    private DradAndDropScreen dradAndDropScreen;


    @AfterMethod
    public void backtoHome(){
        driver.resetApp();
    }

    /*
    Test-Case Description: Navigate to Custom Adapter Screen and long press
    to get list of people names.
    */
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

    /*
    Test-Case Description: Navigate to Clock Screen and select time and
    minutes by press, hold and move
    */
    @Test
    public void clockControlSetTest(){

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

    /*
    Test-Case Description: Navigate to WebView Screen and
    validate that expected text is displayed
    */
    @Test
    public void scrollIntoViewAndValidateWebviewContent(){
        mainScreen = new MainScreen(driver);
        viewsScreen = new ViewsScreen(driver);
        webViewScreen = new WebViewScreen(driver);

        mainScreen.clickListItemViews();
        waitForSeconds(10);
        viewsScreen.clickListItemWebView();
        waitForSeconds(25);
        webViewScreen.validateWebViewContent();
    }

    @Test
    public void dragShapeToTargetLocation(){
        mainScreen = new MainScreen(driver);
        viewsScreen = new ViewsScreen(driver);
        dradAndDropScreen = new DradAndDropScreen(driver);

        mainScreen.clickListItemViews();
        waitForSeconds(10);
        viewsScreen.clickListItemDragAndDrop();
        waitForSeconds(10);
        dradAndDropScreen.moveShapeToTargetLocation();
        waitForSeconds(30);
    }

}
