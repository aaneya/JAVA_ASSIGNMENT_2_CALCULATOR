import java.util.Scanner;// Account class to store account details and operationspublic class Account {    int accountNumber;    String accountHolderName, email, phoneNumber;    double balance;    void deposit(double amount) {        if (amount > 0) balance += amount;        else System.out.println(" Invalid deposit amount.");    }    void withdraw(double amount) {        if (amount > 0 && amount <= balance) balance -= amount;        else System.out.println("Insufficient balance or invalid amount.");    }    void displayAccountDetails() {        System.out.println("\n--- Account Details ---");        System.out.println("Account No   : " + accountNumber);        System.out.println("Name         : " + accountHolderName);        System.out.println("Email        : " + email);        System.out.println("Phone        : " + phoneNumber);        System.out.println("Balance      : " + balance);    }    void updateContactDetails(String e, String p) {        email = e;        phoneNumber = p;    }}// UserInterface class to manage multiple accountsclass UserInterface {    Account[] accounts = new Account[10];    int count = 0;    Scanner sc = new Scanner(System.in);    void createAccount() {        Account acc = new Account();        System.out.print("Enter Account No: "); acc.accountNumber = sc.nextInt(); sc.nextLine();        System.out.print("Enter Name: "); acc.accountHolderName = sc.nextLine();        System.out.print("Enter Email: "); acc.email = sc.nextLine();        System.out.print("Enter Phone: "); acc.phoneNumber = sc.nextLine();        System.out.print("Enter Initial Balance: "); acc.balance = sc.nextDouble();        accounts[count++] = acc;        System.out.println("✅ Account Created Successfully!\n");    }    Account findAccount(int accNo) {        for (int i = 0; i < count; i++)            if (accounts[i].accountNumber == accNo) return accounts[i];        return null;    }    void performDeposit() {        System.out.print("Enter Account No: "); int n = sc.nextInt();        System.out.print("Enter Amount: "); double amt = sc.nextDouble();        Account acc = findAccount(n);        if (acc != null) { acc.deposit(amt); System.out.println("✅ Deposit Successful!"); }        else System.out.println(" Account not found.");    }    void performWithdrawal() {        System.out.print("Enter Account No: "); int n = sc.nextInt();        System.out.print("Enter Amount: "); double amt = sc.nextDouble();        Account acc = findAccount(n);        if (acc != null) acc.withdraw(amt);        else System.out.println(" Account not found.");    }    void showAccountDetails() {        System.out.print("Enter Account No: "); int n = sc.nextInt();        Account acc = findAccount(n);        if (acc != null) acc.displayAccountDetails();        else System.out.println(" Account not found.");    }    void updateContact() {        System.out.print("Enter Account No: "); int n = sc.nextInt(); sc.nextLine();        Account acc = findAccount(n);        if (acc != null) {            System.out.print("Enter New Email: "); String e = sc.nextLine();            System.out.print("Enter New Phone: "); String p = sc.nextLine();            acc.updateContactDetails(e, p);            System.out.println("✅ Contact Updated!");        } else System.out.println(" Account not found.");    }    void mainMenu() {        while (true) {            System.out.println("\n===== Banking Menu =====");            System.out.println("1. Create Account");            System.out.println("2. Deposit Money");            System.out.println("3. Withdraw Money");            System.out.println("4. View Account Details");            System.out.println("5. Update Contact");            System.out.println("6. Exit");            System.out.print("Enter Choice: ");            int ch = sc.nextInt();            switch (ch) {                case 1: createAccount(); break;                case 2: performDeposit(); break;                case 3: performWithdrawal(); break;                case 4: showAccountDetails(); break;                case 5: updateContact(); break;                case 6: System.out.println(" Thank you for using Banking Application!"); return;                default: System.out.println("Invalid choice, try again.");            }        }    }    public static void main(String[] args) {        new UserInterface().mainMenu();    }}

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }   

    double add(double a, double b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int sub(int a, int b, int c) {
        return a - b - c;
    }

    double sub(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Denominator should be greater than zero");
            return 0;
        }
        return a / b;
    }

    double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Denominator should be greater than zero");
            return 0.0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Add two ints: " + obj.add(5, 10));
        System.out.println("Add three ints: " + obj.add(5, 10, 15));
        System.out.println("Add two doubles: " + obj.add(5.0, 10.0));
        System.out.println("Subtract two ints: " + obj.sub(20, 12));
        System.out.println("Subtract two doubles: " + obj.sub(20.5, 10.5));
        System.out.println("Multiply two ints: " + obj.multiply(2, 3));
        System.out.println("Multiply three ints: " + obj.multiply(2, 3, 4));
        System.out.println("Divide two ints: " + obj.divide(10, 2));
        System.out.println("Divide two doubles: " + obj.divide(10.0, 2.0));
    }
}