import java.util.Scanner;

class BankUser {
    static String username;
    static int pin;

    static void createUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        username = scanner.nextLine();

        System.out.print("Enter 4-digit PIN: ");
        pin = scanner.nextInt();

        String pinStr = String.valueOf(pin);

        if (pinStr.length() != 4) {
            System.out.println("Invalid PIN! PIN must be exactly 4 digits.");
            System.exit(0);
        }

        System.out.println(" User created successfully!\n");
    }

    static boolean verifyUser(String inputUser, int inputPin) {
        return username.equals(inputUser) && pin == inputPin;
    }
}


class BankBalance {
    static double balance = 10000; 

    static void showBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            showBalance();
        }
    }
}

 class ATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankUser.createUser();

        System.out.println(" ATM Login");
        System.out.print("Enter Username: ");
        String inputUser = scanner.nextLine();

        System.out.print("Enter PIN: ");
        int inputPin = scanner.nextInt();

        if (BankUser.verifyUser(inputUser, inputPin)) {
            System.out.println("\nLogin successful!");

            int choice;
            do {
                System.out.println("\n---- ATM MENU ----");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Exit");
                System.out.print("Choose option: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        BankBalance.showBalance();
                        break;

                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        double amount = scanner.nextDouble();
                        BankBalance.withdraw(amount);
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 3);

        } else {
            System.out.println("Invalid username or PIN!");
        }
    }
}
