package photoBook;

import com.codeborne.selenide.Selenide;

public class NautEditScreen {
    public NautEditScreen selectPhotosFromAlbumAndAutofile() {
        Selenide.$x("//span[contains(text(),'Shutterfly Photos')]")
                .click();
        Selenide.$x("//button[text()='Albums']")
                .click();
        Selenide.$x("//h4[contains(text(),'my new album')]")
                .click();
        Selenide.$x("//button[@class='sc-emIrwa hdonBu']")
                .click();
        Selenide.$x("//span[contains(text(),'Add to project')]")
                .click();
        Selenide.$x("//button[contains(text(),'AUTOFILL MY BOOK')]")
                .click();
        Selenide.$x("//button[text()='Next']")
                .click();
        Selenide.$x("//button[text()='Next']")
                .click();
        Selenide.$x("//button[contains(text(),'AUTOFILL MY BOOK')]")
                .click();

        return this;
    }

    public String getItemName() {
        String itemName = Selenide.$("div.css-1673lt div.css-m4uafk div.css-mrupca div.css-vurnku div.css-4cffwv section:nth-child(1) div.css-1vpgr5l > div:nth-child(1)")
                .getText();
        return itemName;
    }

    public SFCartPage addToCart() {
        Selenide.$("#header-add-to-cart-button")
                .click();
        Selenide.$x("//button[contains(text(),'Add to cart')]")
                .click();
        Selenide.$("#header-add-to-cart-button")
                .click();
        Selenide.$x("//button[contains(text(),'Cart')]")
                .click();

        return new SFCartPage();
    }

}
