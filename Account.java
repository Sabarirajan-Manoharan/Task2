package Task2;

public class Account {

    private int account;
    private double balance;

    //default constructor
    public Account() {
        System.out.println("Task2.Account Object Initiated");
    }

    //paratermized constructor
    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Amount");
            this.balance = 0.0;
        }
    }

    //method to deposit the amount to the account.
    public void AmtDeposit(double amt){
        if(amt>0){
            System.out.println("D---> Amount Deposit Successfully: " + amt);
            balance=amt+balance;
        }else{
            System.out.println("Invalid Amount");
        }
    }

    //method to withdraw the amount from the account
    public void WithdrawAmt(double amt){

        if(amt>0 && amt<this.balance){
            System.out.println("Amount Withdraw : " + amt);
            balance = balance-amt;
            System.out.println("W---> Amount Withdraw Successfully: " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    //method to display the Balance
    public void DisplayAmt(){
        System.out.println("Available Amount: " + balance);
    }

    public static void main(String[] args) {
        System.out.println("***************SCENARIO I***********************************");
        Account acc = new Account(1000);
        acc.AmtDeposit(500);
        acc.DisplayAmt();
        acc.WithdrawAmt(350);
        acc.DisplayAmt();

        System.out.println("***************SCENARIO II***********************************");
        Account acc1 = new Account(-1000);
        acc1.AmtDeposit(500);
        acc1.DisplayAmt();

        System.out.println("****************SCENARIO III**********************************");
        Account acc2 = new Account();
        acc2.AmtDeposit(500);
        acc2.DisplayAmt();
        acc2.WithdrawAmt(800);
        acc2.DisplayAmt();

    }
}
