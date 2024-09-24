package EncapsulationAbstraction;

public class BankAccount {

    public static void main(String[] args) {

        Account bankAccount = new Account(5000);
        try {
            bankAccount.deposit(1500);
            bankAccount.withDraw(4000);
        } catch (insufficientBalanceException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Programm is Continuing");
    }
}

class insufficientBalanceException extends RuntimeException {

    public insufficientBalanceException (String message) {
        super(message.toUpperCase());
    }
}

class Account {

    private double balance;

    public Account(double initializeBalance){
        this.balance = initializeBalance;
        System.out.println("Current Balance: " + balance);
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance After Deposit: " +balance);
        }
    }

    public void withDraw (double amount) {
        if(amount > balance) {
            throw new insufficientBalanceException("Insufficient balance! Available Balance: " +balance);
        }
        else {
            System.out.println("Balance Amount: " + (balance - amount));
        }
    }
}