public class BankAccount {
    public static void main(String args[]){
        BankAccount raks = new BankAccount();
        raks.balance = 1000;
        raks.withdraw(200);
        System.out.println(raks.balance);
    }

    public String name;
    public String id;
    public double balance;

    public void withdraw(double amount){
        balance = balance - amount;
    }

}
