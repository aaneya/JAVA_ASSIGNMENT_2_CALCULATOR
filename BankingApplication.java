import java.util.Scanner;
class Account {
    int accountNumber;
    String accountHolderName, email, phoneNumber;
    double balance;

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Amount Deposited: " + amount);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }


    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }


    void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No   : " + accountNumber);
        System.out.println("Name         : " + accountHolderName);
        System.out.println("Email        : " + email);
        System.out.println("Phone        : " + phoneNumber);
        System.out.println("Balance      : " + balance);
    }


    void updateContactDetails(String e, String p) {
        email = e;
        phoneNumber = p;
        System.out.println(" Contact details updated successfully!");
    }
}

// UserInterface class to manage multiple accounts
public class BankingApplication {
    Account[] accounts = new Account[10]; // Array to store accounts
    int count = 0;
    Scanner sc = new Scanner(System.in);

    // Create a new account
    void createAccount() {
        Account acc = new Account();
        System.out.print("Enter Account No: ");
        acc.accountNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        acc.accountHolderName = sc.nextLine();
        System.out.print("Enter Email: ");
        acc.email = sc.nextLine();
        System.out.print("Enter Phone: ");
        acc.phoneNumber = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();
        accounts[count++] = acc;
        System.out.println(" Account Created Successfully!\n");
    }

    // Find account by account number
    Account findAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    // Deposit money
    void performDeposit() {
        System.out.print("Enter Account No: ");
        int n = sc.nextInt();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        Account acc = findAccount(n);
        if (acc != null) {
            acc.deposit(amt);
        } else {
            System.out.println(" Account not found.");
        }
    }

    // Withdraw money
    void performWithdrawal() {
        System.out.print("Enter Account No: ");
        int n = sc.nextInt();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        Account acc = findAccount(n);
        if (acc != null) {
            acc.withdraw(amt);
        } else {
            System.out.println(" Account not found.");
        }
    }

    // Show account details
    void showAccountDetails() {
        System.out.print("Enter Account No: ");
        int n = sc.nextInt();
        Account acc = findAccount(n);
        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println(" Account not found.");
        }
    }

    // Update contact details
    void updateContact() {
        System.out.print("Enter Account No: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        Account acc = findAccount(n);
        if (acc != null) {
            System.out.print("Enter New Email: ");
            String e = sc.nextLine();
            System.out.print("Enter New Phone: ");
            String p = sc.nextLine();
            acc.updateContactDetails(e, p);
        } else {
            System.out.println(" Account not found.");
        }
    }

    // Menu for user interaction
    void mainMenu() {
        while (true) {
            System.out.println("\n===== Banking Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. Update Contact");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: 
                    System.out.println(" Thank you for using Banking Application!");
                    return;
                default: System.out.println(" Invalid choice, try again.");
            }
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        new BankingApplication().mainMenu();
    }
}
