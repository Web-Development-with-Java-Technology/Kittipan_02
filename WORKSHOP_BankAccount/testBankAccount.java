import java.util.Scanner;

public class testBankAccount {
    public static void main(String[] args) {
        int option;
        double Deposit;
        double Withdraw;
        Scanner kb = new Scanner(System.in);
        BankAccount bank1 = new BankAccount(" 3664521828 ", " Nantawat Masviset ", 900);
        System.out.println("========== Bank Account ==========");
        System.out.println("ID Account  :" + bank1.getId());
        System.out.println("Name        :" + bank1.getName());
        System.out.println("============   Menu   ============");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.print("Please select your choice [ 1 - 3 ] : ");
        option = kb.nextInt();

        if (option == 1) {
            System.out.print("Please enter amount :");
            Deposit = kb.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println("====== >> Successfully executed << ======");
            System.out.println("-----------------------------------------");
            bank1.deposit(Deposit);
            System.out.println("Balance       : " + bank1.checkBalance() + "Bath");
            System.out.println("========= >>>> Thank you <<<< =========");
        } else if (option == 2) {
            System.out.print("Please enter amount :");
            Withdraw = kb.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println("====== >> Successfully executed << ======");
            System.out.println("-----------------------------------------");
            bank1.withdraw(Withdraw);
            System.out.println("Balance       : " + bank1.checkBalance() + "Bath");
            System.out.println("========= >>>> Thank you <<<< =========");
        }else{
            System.out.println("========== >>>> Check Balance <<<< ==========");
            System.out.println("Balance       : " + bank1.checkBalance() + "Bath");
        }
    }
}
