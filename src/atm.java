package Atm_working;
import java.util.*;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("amt invalied available ");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("cant withdraw more than the limit");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(1000.0);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1-Check Balance");
            System.out.println("2-Deposit");
            System.out.println("3-Withdraw");
            System.out.println("4-Exit");
            System.out.print("Please enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit done succesfull");
                    break;
                case 3:
                    System.out.print("Enter amt for withdraw ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal completed");
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (InvalidAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you visit again ");
                    System.out.println("pleace collect your card ");
                    System.exit(0);
                default:
                    System.out.println("pleace collect your card");
                    break;
            }
            System.out.println();
        }

    }
}
