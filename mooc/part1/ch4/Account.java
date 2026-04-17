package mooc.part1.ch4;

public class Account {
    private String name;
    private Double amount;

    public Account() {
    }

    public Account(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void withdraw(double amount) {
        this.amount -= amount;
    }

    public void deposit(double deposit) {
        amount += deposit;
    }

    public Double balance() {
        return amount;
    }

    @Override
    public String toString() {
        return "This is " + this.name + "\nThe balance is " + amount;

    }

    public static void method() {
        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    }
}
