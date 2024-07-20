public class Contract {
    private Customer customer;
    private Building building;
    private int rentalPeriod; // months
    private double price;
    private Payment paymentMethod; // Payment method (PayPal, Visa, MasterCard)
    private String contractTerms;

    public Contract(Customer customer, Building building, int rentalPeriod, double price, Payment paymentMethod, String contractTerms) {
        this.customer = customer;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.contractTerms = contractTerms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getContractTerms() {
        return contractTerms;
    }

    public void setContractTerms(String contractTerms) {
        this.contractTerms = contractTerms;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "customer=" + customer.getFirstName()+" "+ customer.getLastName() +
                ", building=" + building.getBuildingName() +
                ", rentalPeriod=" + rentalPeriod +
                ", price=" + price +
                ", paymentMethod='" + paymentMethod.getClass().getSimpleName()+ '\'' +
                ", contractTerms='" + contractTerms + '\'' +
                '}';
    }
}
