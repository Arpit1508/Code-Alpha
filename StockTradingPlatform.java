import java.util.*;

class Stock {
    String name;
    double price;

    Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class User {
    String name;
    double balance;

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock stock = new Stock("TCS", 3500);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your balance: ");
        double balance = sc.nextDouble();

        User user = new User(name, balance);

        System.out.println("\nStock Market");
        System.out.println("Stock Name: " + stock.name);
        System.out.println("Stock Price: " + stock.price);

        System.out.println("\n1. Buy Stock");
        System.out.println("2. Sell Stock");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = quantity * stock.price;

            if (total <= user.balance) {
                user.balance = user.balance - total;

                System.out.println("Stock purchased successfully");
                System.out.println("Total Amount = " + total);
                System.out.println("Remaining Balance = " + user.balance);
            } else {
                System.out.println("Insufficient balance");
            }

        } else if (choice == 2) {

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double total = quantity * stock.price;

            user.balance = user.balance + total;

            System.out.println("Stock sold successfully");
            System.out.println("Amount Received = " + total);
            System.out.println("New Balance = " + user.balance);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}