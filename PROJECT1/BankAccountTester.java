package PROJECT1;

import java.util.Scanner;

public class BankAccountTester {

    public static void main(String[] args) {
        //  PART 1
        Scanner keyboard = new Scanner(System.in);
        // BankAccount gregChecking = new BankAccount();
        // System.out.println("Enter your balance...");
        // double balance = keyboard.nextDouble();
        // System.out.println("Enter the amount you would like to withdraw...");
        // double amount = keyboard.nextDouble();
        // gregChecking.overdraft(balance, amount);
        //  the parameters (balance, amount) are used in the overdraft method
        
        // PART 2
        // System.out.println("Enter your balance for Bank Account 1...");
        // double bankAccount1 = keyboard.nextDouble();
        // System.out.println("Enter the amount you would like to transfer to Bank Account 2...");
        // double transferAmount = keyboard.nextDouble();
        // System.out.println("Enter your balance for Bank Account 2...");
        // double bankAccount2 = keyboard.nextDouble();
        // gregChecking.transfer(bankAccount1, bankAccount2, transferAmount);
        // the parameters (bankAccount1, bankAccount2, transferAmount) are used in the transfer method

        // PART 3
        // System.out.println("Calculate Simple Interest...Start by entering the principal amount");
        // double P = keyboard.nextDouble();
        // System.out.println("Enter the rate per annum...");
        // double R = keyboard.nextDouble();
        // System.out.println("Enter the time in years...");
        // int T = keyboard.nextInt();
        // gregChecking.calcSimpleInterest(P, R, T);
        // the parameters (P, R, T) are used in the calcSimpleInterest method

        // PART 4
        // System.out.println("Creating a Savings Account... Enter the initial balance");
        // double initialValue = keyboard.nextDouble();
        // gregChecking.savingsAccount(initialValue);
        // the parameter (InitialValue) is used in the savingsAccount method

        // PART 5
        System.out.println("Hello welcome to your Bank Account...how much money would you like to start with?");
        double startingBal = keyboard.nextDouble();
        BankAccount userBank = new BankAccount(startingBal);
        int menuSelection = BankAccount.menu();

        if (menuSelection == 1){
            // balance
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+userBank.getBalance());
        } else if (menuSelection == 2) {
            // deposit
            System.out.println("Please enter the amount to Deposit...");
            double depositAmount = keyboard.nextDouble();
            userBank.deposit(depositAmount);
            System.out.println("Amount: $" + depositAmount + " Was Deposited");
            System.out.println("Total Balance: $"+userBank.getBalance());
        }else if (menuSelection == 3){
            // withdraw
            System.out.println("Please enter the amount to Withdraw...");
            double withdrawAmount = keyboard.nextDouble();
            userBank.withdraw(withdrawAmount);
            System.out.println("Amount: $" + withdrawAmount + " Was Withdrew");
            System.out.println("Total Balance: $"+userBank.getBalance());
        }else if(menuSelection == 4){
            // transfer money
            System.out.println("Enter your balance for Bank Account 1...");
            double bank1 = keyboard.nextDouble();
            System.out.println("How much would you like to transfer to Bank Account 2...");
            double transferBank = keyboard.nextDouble();
            System.out.println("Enter your balance for Bank Account 2...");
            double bank2 = keyboard.nextDouble();
            userBank.transfer(bank1, bank2, transferBank);
        }else if(menuSelection == 5){
            // savings account
            System.out.println("Creating a Savings Account...How much would like to start the account with?");
            double initialSavings = keyboard.nextDouble();
            userBank.savingsAccount(initialSavings);
        }else if (menuSelection == 0){
            System.out.println("Have a good day ... ");
        }else{
            System.out.println("Error: NO VALID SELECTION");
        }
    }
}
