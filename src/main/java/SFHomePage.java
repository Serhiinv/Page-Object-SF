import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class SFHomePage extends PageWithBase {
    public SFHomePage openHomePage() {
        Configuration.browser = "firefox";
//        Configuration.browser = "chrome";
        Configuration.timeout = 100 * 1000;
        Configuration.holdBrowserOpen = true;
        Selenide.open("https://www.shutterfly.com/");
        return this;
    }


}
