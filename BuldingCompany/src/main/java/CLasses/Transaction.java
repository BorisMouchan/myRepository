package CLasses;

import Exceptions.TransactionException;
import Interface.IPayments;
import enums.CurrencyType;

public final class Transaction extends BankDetails implements IPayments {

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
        return "Total Transactions list: " + toString();
    }


    @Override
    public void makePayments() throws TransactionException{
        if (amount<0) {
            throw new TransactionException("The amount of transaction is incorrect!");
            }
        }
    }
