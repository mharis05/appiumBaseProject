package appiumWork.screens.locators;

public interface ViewsScreenLocators {

    String listItemExpandableLists =  "//android.widget.TextView[@text='Expandable Lists']";
    String listItemDateWidgets = "text(\"Date Widgets\")";
    String listItemWebView = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))";
}
