import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;
        do {
            System.out.println("-Welcome to ATM-");
            System.out.println("Check balance");
            System.out.println("Withdraw money");
            System.out.println("Deposit money");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            System.out.println("Transaction history");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your balance is " + balance);
                    break;

                case 2:

                    System.out.println("Deposit Money");

                    double amount = sc.nextDouble();
                    balance = balance + amount;
                    System.out.println("the total balance is " + balance);
                    history.add("        deposited money: " + amount);

                    System.out.println("deposited succesfiully");

                    break;

                case 3:
                    System.out.println("Enter withraw money");
                    double Withdraw = sc.nextDouble();
                    if (Withdraw <= balance) {
                        balance = balance - Withdraw;
                        System.out.println("Withdraw Succesfull");
                        System.out.println("the avail balance is" + balance);
                        history.add("      Withdrawn: Rs." + Withdraw);
                    } else {
                        System.out.println("no balance");

                    }

                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                case 5:
                    showHistory();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
        sc.close();

    }

    public static void showHistory() {
        System.out.println("-------Transaction history--------");
        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

}
