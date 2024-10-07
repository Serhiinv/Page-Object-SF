import org.testng.annotations.Test;

public class SFPhotoBookTest {

    @Test
    public void verifyCreateNautPBFromAlbumAndAddToCart() {
        var email = "email";
        var password = "password";
        var pibPage = new SFHomePage()
                .openHomePage()
                .getHeader()
                .openSignInPage()
                .signIn(email, password)
                .getHeader()
                .openPBCategory()
                .select8x8PB()
                .selectPBDesign();

        var nautEditScreen = pibPage.startPersonalize()
                .selectPhotosFromAlbumAndAutofile();

        var itemName = nautEditScreen.getItemName();
        var sfCartPage = nautEditScreen.addToCart();
        sfCartPage.verifyPBIsAddedToCart(itemName);
    }

}
