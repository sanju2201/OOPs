package BankAccount;

public class Main {
    public static void main(String[] args) {
  SBI sbi = new SBI();
  sbi.depositMoney(10000);
  sbi.withdrawMoney(200);
       // System.out.println(sbi.balance);


        HDFC hdfc  = new HDFC();
        hdfc.depositMoney(1000000);
       // System.out.println(hdfc.balance);

        AXIS axis = new AXIS();
        axis.getLoan(1000);{
          //  System.out.println(axis.loanAmount);
        }

        ICICI ic = new ICICI();
        ic.getLoan(50000);
        System.out.println(ic.loanAmount);


        BankingSystem bs= new HDFC();
        bs.getLoan(20000);{
            System.out.println(bs.loanAmount);
        }
    }
}
