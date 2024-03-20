public class Expenses {
    private String date;
    private String description;
    private double amount;

    public Expenses(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmpunt() {
        return amount;
    }

    @Override
    public String toString() {
        return "Expense(date=" + date + ", description=" + description + ", amount=" + amount + ")";
    }
}