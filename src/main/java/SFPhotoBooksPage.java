import org.testng.Assert;

import static com.codeborne.selenide.WebDriverRunner.url;

public class SFPhotoBooksPage {
    public void verifyPhotoBookPageIsOpen() {
        Assert.assertEquals(url(), "https://www.shutterfly.com/photo-books/");
    }
}
