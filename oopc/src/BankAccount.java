
class BankAcc {


    public String name;
    public String id;
    public double balance;

    public void withdraw(double amount) {
        balance = balance - amount;
    }

}

public class BankAccount{
    public static void main(String args[]){
        BankAcc raks = new BankAcc();
        raks.balance = 1000;
        raks.withdraw(200);
        System.out.println(raks.balance);
    }
}

