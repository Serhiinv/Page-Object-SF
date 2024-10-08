import org.testng.annotations.Test;

public class SFPhotoBookTest {

    @Test
    public void verifyCreateNautPBFromAlbumAndAddToCart() {
        var pibPage = new SFHomePage()
                .openHomePage()
                .signIN()
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
