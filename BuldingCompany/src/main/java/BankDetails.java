public class BankDetails {
    private final String billNumber="BY3014ALFA124124125";
    public CurrencyType currencyType;
    private final String city="WARSAW";
    private final String postAdress="ALEJ_EROSOMLINSKIE_8";

    public String getBillNumber() {
        return billNumber;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public String getCity() {
        return city;
    }

    public String getPostAdress() {
        return postAdress;
    }

    public BankDetails(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
}
