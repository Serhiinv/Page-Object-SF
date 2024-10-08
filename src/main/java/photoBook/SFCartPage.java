package photoBook;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;

public class SFCartPage {
    public void verifyPBIsAddedToCart(String itemName) {
        boolean isItemNameVisible =  Selenide.$x("//i[contains(text(), '" + itemName + "')]")
                .is(Condition.visible);
        Assert.assertTrue(isItemNameVisible);
    }
}
