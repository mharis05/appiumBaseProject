package appiumWork.steps;

import appiumWork.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import java.time.Duration;

public class AndroidSteps extends BaseTest{

    private static TouchAction customAction = new TouchAction(driver);


    public static void pressAndHoldElement(AndroidElement element, Integer seconds){
        customAction.press(element).
                waitAction(Duration.ofSeconds(seconds)).
                release().
                perform();
    }

    public static void tap(AndroidElement element){
       customAction.tap(element)
               .perform();
    }

    public static void pressHoldAndMoveFromOneElementToAnother(AndroidElement sourceElement, AndroidElement targetElement) {
        customAction.longPress(sourceElement).
                waitAction(Duration.ofSeconds(2)).
                moveTo(targetElement).
                release().perform();
    }
}
