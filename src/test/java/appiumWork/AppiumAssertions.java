package appiumWork;

import org.assertj.core.api.SoftAssertions;

public class AppiumAssertions {

    private SoftAssertions softly = new SoftAssertions();

    public void performAllAssertions(){
        softly.assertAll();
    }

    public void validateWebViewContentAgainstString(String actual, String expected){
        softly.assertThat(actual).isEqualTo(expected);
    }
}
