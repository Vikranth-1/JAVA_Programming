class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class User extends Thread {
    Bank b;

    User(Bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(700);
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        User u1 = new User(obj);
        User u2 = new User(obj);

        u1.start();
        u2.start();
    }
}
