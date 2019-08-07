public class Savings {

    static int balance;

    public Savings(){
        balance = 0;
    }
    public Savings(int money){
        this.balance = money;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int money) {
        Savings.balance = money;
    }

    void deposit(int money){
        this.balance += money;
        System.out.println("Deposit "+ money +" Success");

    }

    void withdraw(int money){
        this.balance -= money;
        if (this.balance < 0){

            this.balance += money;
            System.out.println("Insufficient balance");
            System.out.println("Remaining deposit: " + this.balance);
        }else System.out.println("Withdraw " + money +" Success");
    }

    int getTotalBalance(){
        return this.balance;
    }


}
