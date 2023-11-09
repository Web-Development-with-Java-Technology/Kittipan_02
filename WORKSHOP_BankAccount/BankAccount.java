public class BankAccount {
    private String id;
    private String name;
    private double balance;

    public BankAccount() {
        this.id = "1";
        this.name = "Nantawat";
        this.balance = 900;
    }

    public BankAccount(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double checkBalance(){
        return this.balance;
    }
}
