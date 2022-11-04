package BankAccount;

public class SBI extends BankingSystem {

    final double interestRate=8.0;
    @Override
    void getLoan(int money) {
        loanAmount = money;
        loanAmount +=  money*interestRate/100;

    }

    @Override
    double getInterest() {
        return interestRate;

    }

    void depositMoney(int money){
        if(money>100000) {
            balance = balance + money +1000; // 1000 bonus
        }
        else{
            balance = balance + money;

        }
    }
}

