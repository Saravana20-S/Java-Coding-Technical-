package logicprep.oops;

class Account {

    private int balance; 

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.setBalance(10000);

        System.out.println("Balance = " + acc.getBalance());
    }
}