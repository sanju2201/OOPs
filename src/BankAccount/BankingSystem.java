package BankAccount;

abstract class BankingSystem {
    int accountNumber;
    int balance;
    String name;
    int loanAmount;

    void withdrawMoney(int money){
        if(balance>= money){
            //System.out.println("Money Withdraw");
            balance = balance-money;
        }
        else{
            System.out.println("Low account balance");
        }

    }
    void depositMoney(int money){
        balance = balance+money ;
    }
    abstract void getLoan(int amount);

    abstract double getInterest();

    }

