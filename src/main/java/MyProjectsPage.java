import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;

import static com.codeborne.selenide.WebDriverRunner.url;

public class MyProjectsPage {
    public void verifyMyProjectsPageIsOpen() {
        Assert.assertEquals(url(), "https://www.shutterfly.com/mySavedProjects/");
    }
    public SFPhotoBooksPage startPhotoBookProject() {
        Selenide.$x("//span[text()='Photo Books']")
                .click();
        return new SFPhotoBooksPage();
    }
}
