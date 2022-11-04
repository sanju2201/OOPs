package BankAccount;

public class ICICI extends BankingSystem {
    final double interestRate=9.0;
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
