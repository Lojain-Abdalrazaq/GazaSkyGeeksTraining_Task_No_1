public class CreditCard implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String transactionId;
    private double balance;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate, String transactionId, double initialBalance) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.transactionId = transactionId;
        this.balance = initialBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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
            System.out.println("=============================Credit Card Payment================================");
            System.out.println("Processing Visa payment of $" + amount + " for card number " + cardNumber);
            System.out.println("Card Holder Name: " + cardHolderName);
            System.out.println("Transaction ID: " + transactionId);
            System.out.println("Remaining balance: $" + balance);
            System.out.println("====================Payment Process Ended Successfully=====================");
            System.out.println("\n");
            return true;
        } else {
            System.out.println("Insufficient balance for Visa payment of $" + amount);
            System.out.println("Current balance: $" + balance);
            System.out.println("=========================Incomplete Payment=======================");
            System.out.println("\n");
            return false;
        }
    }
}


