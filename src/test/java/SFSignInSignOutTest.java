import org.testng.annotations.Test;
public class SFSignInSignOutTest {

    @Test
    public void verifySignInWorks() {
        var email = "email";
        var password = "password";
        var homePage = new SFHomePage()
                .open()
                .signInPageOpen()
                .signIn(email, password)
                .openAccountSettingsPage()
                .verifyUserSignedInAs(email);
    }

    @Test
    public void verifySignOutWorks() {
        var signInPage = new SFHomePage()
                .open()
                .signOut()
                .verifyUserIsSignedOut();
    }
}
