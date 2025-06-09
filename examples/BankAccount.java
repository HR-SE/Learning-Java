public class BankAccount{
        private double balance;
        private String accountHolder;
        public BankAccount(String holder, double initialBalance) {
            accountHolder = holder;
            balance = initialBalance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + ", New balance: " + balance);
            }
        }
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Himanshu Ranjan",1000);
            account.deposit(500);
        } 
}