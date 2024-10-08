package photoBook;

import com.codeborne.selenide.Selenide;

public class PBSelectDesignPage {
    public PBPibPage selectPBDesign() {
        Selenide.$x("//div[contains(text(),'Simply Gallery')]")
                .click();
        String originalTab = Selenide.webdriver().driver().getWebDriver().getWindowHandle();

        // Switch to the new tab
        for (String tab : Selenide.webdriver().driver().getWebDriver().getWindowHandles()) {
            if (!tab.equals(originalTab)) {
                Selenide.webdriver().driver().getWebDriver().switchTo().window(tab);
                break;
            }
        }
        return new PBPibPage();
    }
}
