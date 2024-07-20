public class PayPal implements Payment{
    private String email;
    private String transactionId;
    private String payerName;
    private String payerCountry;
    private double balance;

    public PayPal(String email, String transactionId, String payerName, String payerCountry, double initialBalance) {
        this.email = email;
        this.transactionId = transactionId;
        this.payerName = payerName;
        this.payerCountry = payerCountry;
        this.balance = initialBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerCountry() {
        return payerCountry;
    }

    public void setPayerCountry(String payerCountry) {
        this.payerCountry = payerCountry;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("=============================PayPal Payment================================");
            System.out.println("Processing PayPal payment of $" + amount + " from " + email);
            System.out.println("Account Name: " + payerName);
            System.out.println("Transaction ID: " + transactionId);
            System.out.println("Remaining balance: $" + balance);
            System.out.println("====================Payment Process Ended Successfully=====================");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("Insufficient balance for PayPal payment of $" + amount);
            System.out.println("Current balance: $" + balance);
            return false;
        }
    }
}
