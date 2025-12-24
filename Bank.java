public class Bank {

    private static int balance = 0;

    public void deposit() {
        balance += 100;
    }

    public void withdraw() {
        balance -= 100;
    }

    public int getValue() {
        return balance;
    }

    public void run() {
        deposit();
        System.out.println(
            "After deposit " + Thread.currentThread().getName() + " : " + getValue()
        );

        withdraw();
        System.out.println(
            "After withdraw " + Thread.currentThread().getName() + " : " + getValue()
        );
    }
}
