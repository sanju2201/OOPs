package BankAccount;
import java.util.*;
public class Processing extends Account{

    public Processing(int amount, String accountNumber, int currentBalance) {
        super(amount, accountNumber, currentBalance);
    }

    public static void main(String[] args) {
        Account user1=new Account(0,"356245",200000);
    }
}
