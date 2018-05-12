package appiumWork.screens.avdApp.locators;

public interface ViewsScreenLocators {

    String listItemExpandableLists =  "//android.widget.TextView[@text='Expandable Lists']";
    String listItemDateWidgets = "text(\"Date Widgets\")";
    String listItemWebView = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))";
    String listItemDragAndDrop = "//android.widget.TextView[@text='Drag and Drop']";
}
