import org.testng.annotations.Test;

public class SFSignInSignOutTest {

    @Test
    public void verifySignInWorks() {
        var email = "email";
        var password = "password";
        var accountPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .openSignInPage()
                .signIn(email, password)
                .getHeader()
                .openAccountSettingsPage();
        accountPage.verifyUserSignedInAs(email);
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
