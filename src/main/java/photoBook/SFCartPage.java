package photoBook;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class SFCartPage {
    public void verifyPBIsAddedToCart(String itemName) {
        Selenide.$x("//i[contains(text(), '" + itemName + "')]")
                .is(Condition.visible);
    }
}
