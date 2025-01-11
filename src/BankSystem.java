
import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        // إنشاء كائن SystemBank
        SystemBank bank = new SystemBank(500, 12345,name);

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
            option = input.nextInt();

            switch (option) {
                case 1:
                    bank.deposit();
                    break;
                case 2:
                    bank.withdraw();
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    bank.display();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5); // تكرار القائمة

        input.close(); // إغلاق Scanner
    }
}
