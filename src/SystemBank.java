
import java.util.Scanner;

public class SystemBank {
// تعريف الخصائص
    int balance = 0;
    int accountNumber = 0;
    String accountName = "";
    static Scanner input = new Scanner(System.in);
// إنشاء البنك
    public SystemBank(int balance, int accountNumber, String accountName) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
// إنشاء الدوال
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        int amount = input.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = input.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void display() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
