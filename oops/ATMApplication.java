package logicprep.oops;


class ATM {

    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }
}

public class ATMApplication {
    public static void main(String[] args) {

        ATM atm = new ATM(0);

        atm.deposit(5000);
        atm.checkBalance();

        atm.withdraw(2000);
        atm.checkBalance();
    }
}