package CLasses;

import Exceptions.TransactionException;
import Interface.IPayments;
import enums.CurrencyType;

public final class Transaction extends BankDetails implements IPayments {

    private String description;
    private int amount;

    public Transaction(String billNumber, String city, String postAdress, String bankName, CurrencyType currencyType, String description, int amount) {
        super(billNumber, city, postAdress, bankName, currencyType);
        this.description = description;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "currencyType=" + currencyType +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

    public final String getTotalTransactions(){
        return "Total Transactions list: " + toString();
    }


    @Override
    public void makePayments() throws TransactionException{
        if (amount<0) {
            throw new TransactionException("The amount of transaction is incorrect!");
            }
        }
    }
