package appiumWork.screens.avdApp;

import appiumWork.PageObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static appiumWork.steps.AndroidSteps.pressHoldAndMoveFromOneElementToAnother;

public class DradAndDropScreen extends PageObject{

    public DradAndDropScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    private AndroidElement sourceElement;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    private AndroidElement targetElement;

    public void moveShapeToTargetLocation(){
        pressHoldAndMoveFromOneElementToAnother(sourceElement,targetElement);
    }
}
