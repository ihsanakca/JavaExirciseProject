package day19_bank_account_project;

public class BankSystemTest {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("AC12542", 10000, 4.5);

        System.out.println("======Savings Account=====");
        savingAccount.displayInfo();

        savingAccount.deposit(5000);

        savingAccount.applyInterest();

        System.out.println("\n======Savings Account=====");
        CheckingAccount checkingAccount = new CheckingAccount("SG15225",20000,5000);
        checkingAccount.displayInfo();

        checkingAccount.withdraw(24000);

        checkingAccount.withdraw(1000);
        checkingAccount.withdraw(1000);


    }
}
