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
        var projectPage = new SFHomePage()
                .openHomePage()
                .signIN()
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
