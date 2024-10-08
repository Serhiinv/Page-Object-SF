import org.testng.annotations.Test;

public class SFSignInSignOutTest {

    @Test
    public void verifySignInWorks() {
        var homePage = new SFHomePage()
                .openHomePage()
                .signIN();

        var accountPage = homePage.getHeader()
                .openAccountSettingsPage();
        accountPage.verifyUserSignedInAs(homePage.getEmail());
    }

    @Test
    public void verifySignOutWorks() {
        var signInPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .signOut();
        signInPage.verifyUserIsSignedOut();
    }
}
