package logicprep.oops;


class BankAccount {

    private int balance = 0;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance " + balance);
    }
}

public class BankApplication {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.checkBalance();

        System.out.println();

        account.withdraw(2000);

        System.out.println();

        account.checkBalance();
    }
}