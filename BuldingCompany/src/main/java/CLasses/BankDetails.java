package CLasses;

import enums.CurrencyType;

import java.util.Objects;

public class BankDetails {

    private String billNumber;
    private String city;
    private String postAdress;
    private String bankName;
    public CurrencyType currencyType;

    public BankDetails(String billNumber, String city, String postAdress, String bankName, CurrencyType currencyType) {
        this.billNumber = billNumber;
        this.city = city;
        this.postAdress = postAdress;
        this.bankName = bankName;
        this.currencyType = currencyType;
    }

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

    @Override
    public String toString() {
        return "BankDetails{" +
                "billNumber='" + billNumber + '\'' +
                ", city='" + city + '\'' +
                ", postAdress='" + postAdress + '\'' +
                ", bankName='" + bankName + '\'' +
                ", currencyType=" + currencyType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankDetails that = (BankDetails) o;
        return Objects.equals(billNumber, that.billNumber) && Objects.equals(city, that.city) && Objects.equals(postAdress, that.postAdress) && Objects.equals(bankName, that.bankName) && currencyType == that.currencyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(billNumber, city, postAdress, bankName, currencyType);
    }
}
