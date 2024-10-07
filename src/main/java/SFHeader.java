import photoBook.SFPhotoBooksCategoryPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class SFHeader {
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
        return new SFHomePage();
    }

    public SFSignInPage openSignInPage() {
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

    public SFSignInPage openProjectsPageSignedOutUser() {
        closeExtra15Popup();
        Selenide.$x("//span[contains(text(),'Projects')]")
                .click();
        return new SFSignInPage();
    }

    public MyProjectsPage openProjectsPageSignedInUser() {
        closeExtra15Popup();
        Selenide.$x("//span[contains(text(),'Projects')]")
                .click();
        return new MyProjectsPage();
    }

    public SFPhotoBooksCategoryPage openPBCategory() {
        Selenide.$x("//span[@class='cat-item-text' and text()='Photo Books']")
                .click();
        return new SFPhotoBooksCategoryPage();
    }
}
