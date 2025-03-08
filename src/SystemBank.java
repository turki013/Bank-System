import java.time.LocalDateTime;
import java.util.Scanner;

 class Account{

    static String user = "admin";
    static String pass = "password";
    static String conformpass = "password";
    static LocalDateTime lastLogin = LocalDateTime.now();
    static boolean isLoggedIn = false;
    static Scanner input = new Scanner(System.in);

    static void signUp() {

        System.out.println("Enter the user: ");
        user = input.nextLine();
        System.out.println("Enter the password: ");
        pass = input.nextLine();
        System.out.println("Conform the password: ");
        conformpass = input.nextLine();
        if (pass.equals(conformpass)) {
            System.out.println("The account has been created successfully");
        } else {
            System.out.println("The password does not match");
        }
    }

    static boolean login() {
        if (user == null || pass == null) {
            System.out.println("The account does not exist");
            return false;
        } else {
            System.out.println("Enter ur user: ");
            String user1 = input.nextLine();
            System.out.println("Enter ur password: ");
            String pass1 = input.nextLine();
            if (user.equals(user1) && pass.equals(pass1)) {
                System.out.println("The account has been logged in successfully");
                isLoggedIn = true;
                lastLogin();
                return true;

            } else {
                System.out.println("The user or password is incorrect");
                return false;
            }
        }
    }

    static void lastLogin() {
        System.out.println("The last login was: " + lastLogin);
        lastLogin = LocalDateTime.now();
    }

    static void forgetPassword() {
        System.out.println("Enter the user: ");
        String user1 = input.nextLine();
        if (user.equals(user1)) {
            System.out.println("Enter the new password: ");
            pass = input.nextLine();
            System.out.println("The password has been changed successfully");
        } else {
            System.out.println("The user does not exist");
        }
    }

    static void ResetPassword() {
        System.out.println("Enter ur current password: ");
        String currentPassword = input.nextLine();
        if (currentPassword.equals(pass)) {
            System.out.println("Enter the new password: ");
            pass = input.nextLine();
            System.out.println("The password has been changed successfully");
        } else {
            System.out.println("The password is incorrect");

        }
    }

    static void deleteAccount() {
        System.out.print("Are you sure you want to delete the account? (yes/no): ");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            user = null;
            pass = null;
            System.out.println("The account has been deleted successfully");
        } else {
            System.out.println("The account has not been deleted");
        }
    }

}

public class SystemBank {
    int balance = 0;
    int accountNumber = 0;
    String accountName = " ";
 
// إنشاء الدوال
    public void StartBank() {
        int option;
        
        // عرض القائمة
          do {
              System.out.println("\nWelcome to the Bank System");
              System.out.println("1. Deposit");
              System.out.println("2. Withdraw");
              System.out.println("3. Check Balance");
              System.out.println("4. Display Account Info");
              System.out.println("5. Exit");
              System.out.print("Please select an option: ");
              option = Account.input.nextInt();
  
              switch (option) {
                  case 1:
                      deposit();
                      break;
                  case 2:
                      withdraw();
                      break;
                  case 3:
                      checkBalance();
                      break;
                  case 4:
                     display();
                      break;
                  case 5:
                      System.out.println("Exiting... Goodbye!");
                      break;
                  default:
                      System.out.println("Invalid option. Please try again.");
              }
          } while (option != 5); // تكرار القائمة
  
        }
        
       
    
    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        int amount = Account.input.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = Account.input.nextInt();
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
