package day19_bank_account_project;

public class SavingAccount extends BankAccount {

    private double interestRate;

    public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("interestRate = %" + interestRate);
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest is applied. New balance : £" + getBalance());
    }
}
