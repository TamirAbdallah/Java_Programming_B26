package day11_if_statements;

public class BankAccount {
    /*
    Task: Hard code -> Dynamic
    Create a double value for the account balance. // 400
    Create a double value for how much you want to withdraw // 1000
    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100
    In both cases print the remaining balance after withdrawing, with overdraft fee applied if you went over
     */
    public static void main(String[] args) {
        double balance = 400;
        double withdraw = 1000;
        // withdraw some amount of money from my balance
        balance -= withdraw; // balance = balance - withdraw
        if(balance < 0){
            System.out.println("Took out too much money, $100 overdraft applied");
            System.out.println("Balance before fee: " + balance);
            balance -= 100; // balance = balance - 100;
        }

        System.out.println("Balance $" + balance);

    }
}
