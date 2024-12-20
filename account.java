public class Account {
    private int balance; 
    //balance = initialBalance;


public Account (int initialBalance) {
    //this.balance = balance;
    if(initialBalance >= 0) {
        balance = initialBalance;
    }else{
        balance = 0;
        System.out.println("invalid initial balance!");
    }

    }

    public void credit(int amount) {
        balance+=amount;
    }

    public void debit(int amount) {
        //balance-=amount;
        if(balance < amount) {
            System.out.println("ur not allowed to draw money!");

        }else{
            balance-=amount;
        }
    }

    public int getBalance() {
        return balance;
    }




public static void main(String[] args) {
    Account account = new Account(1000);
   // account.credit = (500);
    account.debit = (400);
    System.out.println("the balance of account " + account.getBalance());

}
}