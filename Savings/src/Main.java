public class Main {

    public static void main(String[] args) {

        Savings tom = new Savings();

        tom.deposit(5000);
        tom.deposit(5000);
        tom.withdraw(2000);
        tom.withdraw(2000);
        tom.withdraw(2000);
        tom.withdraw(2000);
        tom.withdraw(1800);
        tom.withdraw(2000);
        System.out.println(tom.getTotalBalance());

    }
}
