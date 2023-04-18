public class BankDetails {
    private String billNumber;
    private String city;
    private String postAdress;
    private String bankName;
    public CurrencyType currencyType;

    public String getBankName() {
        return bankName;
    }

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
