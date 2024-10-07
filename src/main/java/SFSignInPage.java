import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;

public class SFSignInPage {

    public SFHomePage signIn(String email, String password) {
        Selenide.$x("//*[@id='email']") //
                .setValue(email);
        Selenide.$x("//*[@id='password']") //
                .setValue(password);
        Selenide.$x("//button[contains(text(),'Sign In')]")
                .click();

        return new SFHomePage();
    }

    public void verifyUserIsSignedOut() {
       boolean isEmailFieldVisible = Selenide.$x("//*[@id='email']")
                .is(Condition.visible);
        Assert.assertTrue(isEmailFieldVisible);
    }

    public SFSignInPage verifyProjectsPageIsNotAvailable() {
        verifyUserIsSignedOut();
        return this;
    }
}