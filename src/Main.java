/**
 * Lojain Abdalrazaq
 *
 * In tmy solution, I worked on developing a simple applaication that aims to use all the terms and required implementation
 * that we were asked for such as Inheritance, abstraction, polymorphism, aggregation, and composition.
 *
 * 1. Aggregation, and Composition: for the relationships,for example, I used the aggregation between the address and the building
 * while the composition between the customers and the contracts of renting different building types such that without
 * the customers, there will be no contracts, as a result the relation is strong. However, either the building is still
 * existed or disappeared, the address will still exist, so the relation will be aggregation, and so on with other examples.
 *
 * 2. Abstraction: both the parent class "Building" and the interface "Payment" used the abstraction.
 *
 * 3. Inheritance: Such as the Building class represent the parent class, and Apartment, House, Shop are the chilren who
 * inherit all the attributes and the methods from the parent and add their customised ones.
 *
 * 4. Polymorphism: The Payment interface is implemented by both CreditCard and PayPal classes.
 *
 * */
public class Main{
    public static void main(String[] args){
        // first I want to create the customers who want to rent buildings
        Customer customer1 = new Customer("Lojain", "Abdalrazaq");
        Customer customer2 = new Customer("Mohammad", "Mahmoud");

        // creating addresses for the apartments
        Address address1 = new Address("Main street", "Ramallah", "Palestine");
        Address address2 = new Address("Al-Quds street", "Al-Bireh", "Palestine");

        // now, I want to create several buildings types including houses, appartment.
        Apartment apartment1 =  new Apartment("Appartment1", 90.0, address1, 5, 3, 7, true, true);
        Apartment apartment2 =  new Apartment("Appartment2", 70.0, address2, 4, 1, 2, false, true);

        // creating a payment methods
        PayPal payPal1 = new PayPal("lojain@gmail.com", "transactionId_1", customer1.getFirstName()+" "+customer1.getLastName(), "Palestine", 5000.0);
        CreditCard card1 = new CreditCard("123", customer1.getFirstName()+" "+customer2.getLastName(), "31/7/2024", "transactionId_2", 3000.0);

        // contract for customer 1 and customer 2
        Contract contract1 = new Contract(customer1, apartment1, 6, apartment1.getRentingPrice(), payPal1, "terms of contract...");
        Contract contract2 = new Contract(customer2, apartment1, 9, apartment1.getRentingPrice(), card1, "different terms of contract...");

        // trying to rent the apratment1 for customer 1
        if (customer1.rentBuilding(apartment1, contract1)) {
            if (payPal1.processPayment(contract1.getPrice())) {
                System.out.println("**************************************************");
                System.out.println("The building is rented and the Payment successful!");
                System.out.println("**************************************************");
            } else {
                System.out.println("********************************************************************************************************************");
                System.out.println("Renting and Payment failed. There is no building is rented by "+customer1.getFirstName()+" "+ customer1.getLastName());
                System.out.println("********************************************************************************************************************");

            }
        }
        // trying to rent the same apartment for custmer 2, it supposed to this operation to be failed.
        if (customer2.rentBuilding(apartment1, contract2)) {
            if (card1.processPayment(contract2.getPrice())) {
                System.out.println("**************************************************");
                System.out.println("The building is rented and the Payment successful!");
                System.out.println("**************************************************");
            } else {
                System.out.println("********************************************************************************************************************");
                System.out.println("Renting and Payment failed. There is no building is rented by "+customer1.getFirstName()+" "+ customer1.getLastName());
                System.out.println("********************************************************************************************************************");
            }
        }
    }
}