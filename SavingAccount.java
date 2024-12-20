public class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate)/ 12;
        savingsBalance+=monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver1 balance: " + saver1.getSavingsBalance());
        System.out.println("saver2 balance: " + saver2.getSavingsBalance());

        SavingAccount.modifyInterestRate(0.5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("saver1 balance: " + saver1.getSavingsBalance());
        System.out.println("saver2 balance: " + saver2.getSavingsBalance());




        



    }
}