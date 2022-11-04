package BankAccount;

public class AXIS extends BankingSystem {
    final double interestRate=4.0;
    @Override
    void getLoan(int money) {
        loanAmount = money;
        loanAmount +=  money*interestRate/100;

    }

    @Override
    double getInterest() {
        return interestRate;

    }
}
