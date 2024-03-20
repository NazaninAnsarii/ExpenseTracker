import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Expenses> expenses = ExpenseStorage.loadExpenses();

        while (true){
            System.out.println("\n Expense Tracker Menu: ");
            System.out.println("1. Add Expense");
            System.out.println("2. View Exenses");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice: ");
            int choice = scn.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Date (YYYY-MM-DD): ");
                    String date = scn.next();
                    scn.nextLine();
                    System.out.println("Enetr Description: ");
                    String desc = scn.nextLine();
                    System.out.println("Enetr Amount: ");
                    Double amount = scn.nextDouble();
                    expenses.add(new Expenses(date , desc , amount));
                    ExpenseStorage.saveExpenses(expenses);
                    break;
                case 2:
                    for (Expenses e : expenses){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid Choice. Select From Menu");
            }
        }
    }
}
