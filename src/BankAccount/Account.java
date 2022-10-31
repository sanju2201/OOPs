package BankAccount;
import java.util.*;
public class Account {


     private String accountNumber;
     int amount;
     int currentBalance;

    public Account(int amount, String accountNumber, int currentBalance) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }




}
