package OOPS;
class Account1 {
    private String id;
    private String name;
    private int balance;

    public Account1(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0; 
    }

    public Account1(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credited(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo(Account1 another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credited(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

public class Account {
    public static void main(String[] args) {
        Account1 obj1 = new Account1("123", "Thoushi", 1000);
        Account1 obj2 = new Account1("456", "Subi");

        System.out.println(obj1);  
        System.out.println(obj2); 

        obj1.credited(500);  
        System.out.println(obj1);

        obj1.debit(200);  
        System.out.println(obj1);

        obj1.transferTo(obj1, 300);  
        System.out.println(obj1);

        obj1.debit(1500);  
    }
}

