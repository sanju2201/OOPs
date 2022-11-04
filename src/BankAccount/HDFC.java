package BankAccount;

public class HDFC extends BankingSystem {
    final double interestRate=5.0;
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
            balance = balance + money +500; // 1000 bonus
        }
        else{
            balance = balance + money;

        }
    }
}
