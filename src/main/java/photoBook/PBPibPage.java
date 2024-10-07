package photoBook;

import com.codeborne.selenide.Selenide;

public class PBPibPage {
    public NautEditScreen startPersonalize() {
        Selenide.sleep(3*100);
        Selenide.$x("//a[text()='personalize']")
                .click();
        Selenide.$x("(//a[contains(@class, 'store-button')])[1]")  //select naut flow
                .click();
        return new NautEditScreen();
    }
}
