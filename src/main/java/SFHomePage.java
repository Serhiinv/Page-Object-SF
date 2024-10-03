import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class SFHomePage {
    public SFHomePage open() {
        Configuration.browser = "firefox";
//        Configuration.browser = "chrome";
        Configuration.timeout = 100 * 1000;
        Configuration.holdBrowserOpen = true;
        Selenide.open("https://www.shutterfly.com/");
        return this;
    }

    public static void closeExtra15Popup() {
        Selenide.sleep(10 * 1000);
        if (Selenide.$x("//*[@id='boxclose']").is(Condition.visible)) {
            Selenide.$x("//*[@id='boxclose']")
                    .click();
        }
    }

    public SFHomePage openAccountMenu() {
        Selenide.$x("//header/div[5]/div[2]/ul[1]/li[1]/span[1]/span[1]/a[1]/span[1]")
                .click();
        return this;
    }

    public SFSignInPage signInPageOpen() {
        closeExtra15Popup();
        openAccountMenu();
        Selenide.$x("//a[contains(text(),'Sign In')]")
                .click();
        return new SFSignInPage();
    }

    public AccountPage openAccountSettingsPage() {
        closeExtra15Popup();
        openAccountMenu();
        Selenide.$x("//a[contains(text(),'Account & Settings')]")
                .click();
        return new AccountPage();
    }

    public SFSignInPage signOut() {
        closeExtra15Popup();
        openAccountMenu();
        Selenide.$x("//a[contains(text(),'Sign Out')]")
                .click();
        return new SFSignInPage();
    }
}
