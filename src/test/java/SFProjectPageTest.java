import org.testng.annotations.Test;

public class SFProjectPageTest {

    @Test
    public void verifyProjectPageForSignedOutUser() {
        var signInPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .openProjectsPageSignedOutUser();
        signInPage.verifyProjectsPageIsNotAvailable();
    }

    @Test
    public void verifyProjectPageForSignedInUser() {
        var email = "email";
        var password = "password";
        var projectPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .openSignInPage()
                .signIn(email, password)
                .getHeader()
                .openProjectsPageSignedInUser();
        projectPage.verifyMyProjectsPageIsOpen();
    }
    @Test
    public void verifyProjectPageStartPhotoBook() {
        var booksPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .openProjectsPageSignedInUser()
                .startPhotoBookProject();

        booksPage.verifyPhotoBookPageIsOpen();
    }

}
