import  java.util.Scanner;
public class Assigment_5 {
    public static void main(String[] args) {
        runBankingSystem();
    }

    public static void runBankingSystem() {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        final int MAX_ATTEMPTS = 3;

        System.out.print("Create a 4-digit PIN: ");
        String pin = scanner.nextLine();

        int attempts = 0;
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            String input = scanner.nextLine();

            if (input.equals(pin)) {
                System.out.println("PIN verified.\n");

                int choice = 0;
                while (choice != 4) {
                    System.out.println("--- Banking Menu ---");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");
                    choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter amount to deposit: ");
                        int deposit = scanner.nextInt();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Deposited $" + deposit);
                        } else {
                            System.out.println("Invalid deposit amount.");
                        }

                    } else if (choice == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        int withdraw = scanner.nextInt();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrew $" + withdraw);
                        } else {
                            System.out.println("Invalid or insufficient balance.");
                        }

                    } else if (choice == 3) {
                        System.out.println("Current balance: $" + balance);

                    } else if (choice == 4) {
                        System.out.println("Goodbye!");

                    } else {
                        System.out.println("Invalid option.");
                    }

                    System.out.println(); // Just for spacing
                }

                return; // Exit after done
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("Too many incorrect attempts. System locked.");

}
                    }
