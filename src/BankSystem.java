
    import java.util.Scanner;

    public class BankSystem {
        static Scanner input = new Scanner(System.in);
    
        public static void main(String[] args) {
            BankMenu();  
        }


     static SystemBank MyAccount = new SystemBank();

     // دالة تعرض القائمة للمستخدم
     
     static void BankMenu () {
        int option;
        do {
            System.out.println("\n=== welcom to Bank app=====");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Forget password");
            System.out.println("4. Reset password");
            System.out.println("5. Delete account");
            System.out.println("6. Exit");
            System.out.print("Enter an option: ");
            option = input.nextInt();
        
            switch (option) {
                case 1:
                    Account.signUp();
                    break;
                case 2:
                    Account.login();
                    break;
                case 3:
                    Account.forgetPassword();
                    break;
                case 4:
                    Account.ResetPassword();
                    break;
                case 5:
                    Account.deleteAccount();
                    break;
                case 6:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
             // التحقق من تسجيل المستخدم بنجاح
            if (Account.isLoggedIn) {
                System.out.println("You are logged in. Accessing the Bank System...");
                MyAccount.StartBank(); // فتح النظام بعد تسجيل الدخول
            }
        } while (option != 6);
    }

    }
    

        