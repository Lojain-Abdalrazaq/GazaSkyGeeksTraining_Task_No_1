public class CreditCard implements Payment {
    private String email;
    private String transactionId;
    private String payerName;
    private String payerCountry;

    public CreditCard(String email, String transactionId, String payerName, String payerCountry) {
        this.email = email;
        this.transactionId = transactionId;
        this.payerName = payerName;
        this.payerCountry = payerCountry;
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

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " from " + email);
        System.out.println("Transaction ID: " + transactionId);
        return true;
    }
}


