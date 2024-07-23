import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Expense Summaries");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addExpense(scanner, expenses);
                    break;
                case 2:
                    viewExpenses(expenses);
                    break;
                case 3:
                    viewExpenseSummaries(expenses);
                    break;
                case 4:
                    System.out.println("Exiting Expense Tracker. Have a great day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addExpense(Scanner scanner, ArrayList<Expense> expenses) {
        System.out.print("Enter expense description: ");
        String description = scanner.next();

        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter expense category: ");
        String category = scanner.next();

        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);

        System.out.println("Expense added successfully!");
    }

    private static void viewExpenses(ArrayList<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
        } else {
            System.out.println("Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private static void viewExpenseSummaries(ArrayList<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to summarize.");
        } else {
            System.out.println("Expense Summaries:");
            // You can implement summaries here, such as total expenses for a category or
            // time period.
        }
    }
}

class Expense {
    private String description;
    private double amount;
    private String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Amount: $" + amount + ", Category: " + category;
    }
}