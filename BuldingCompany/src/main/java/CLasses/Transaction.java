package CLasses;

import enums.CurrencyType;

public final class Transaction extends BankDetails {

    private String description;
    private int amount;
    private int transferAdress;

    public Transaction(String billNumber, String city, String postAdress, String bankName, CurrencyType currencyType, String description, int amount, int transferAdress) {
        super(billNumber, city, postAdress, bankName, currencyType);
        this.description = description;
        this.amount = amount;
        this.transferAdress = transferAdress;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "currencyType=" + currencyType +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", transferAdress=" + transferAdress +
                '}';
    }

    public final String getTotalTransactions(){
        String result= "Total Transactions list: " + toString();
        return result;
    }
}
