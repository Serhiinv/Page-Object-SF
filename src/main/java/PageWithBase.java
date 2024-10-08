public abstract class PageWithBase {
    private SFHeader header = new SFHeader();
    private SFFooter footer = new SFFooter();


    public SFHeader getHeader() {
        return header;
    }

    public SFFooter getFooter() {
        return footer;
    }

    private String email = "email";
    private String password = "password";

    public String getEmail() {
        return email;
    }

    public SFHomePage signIN() {
        var homePage = new SFHomePage()
        .getHeader()
                .openSignInPage()
                .signIn(email, password);
        return new SFHomePage();
    }

}
