package day19_bank_account_project;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Overdraft limit: £"+ this.overdraftLimit);
    }

    public void withdraw(double amount){
        if (amount > 0 && super.getBalance() - amount >= -overdraftLimit){
            super.balance -= amount;
            System.out.println("Withdraw successful, New Balance: £" + super.balance);
        }else{
            System.out.println("Invalid withdraw amount or exceeds overdraft limit");
        }
    }
}
