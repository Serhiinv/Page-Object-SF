package photoBook;

import com.codeborne.selenide.Selenide;

public class SFPhotoBooksCategoryPage {
    public PBSelectDesignPage select8x8PB() {
        Selenide.$x("//a[text()='Shop 8x8']")
                .click();
        return new PBSelectDesignPage();
    }
}
