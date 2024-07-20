import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private List<Contract> contractList;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =  lastName;
        // intially, the arraylist for the customer is empty
        this.contractList = new ArrayList<>();
    }

    // function to rent a house, apartment, shop, etc..
    public boolean rentBuilding(Building building, Contract contract) {
        // Checking if the building is already rented
        if (building.isRented()) {
            System.out.println("==================================================");
            System.out.println("The building is already rented. You can't rent it.");
            System.out.println("==================================================");
             return false;
        }
        System.out.println("=======================================================================");
        System.out.println("The building is available for renting... The contract is being written.");
        // Create a new contract for this rental
        Contract newContract = new Contract(this, building, contract.getRentalPeriod(), contract.getPrice(), contract.getPaymentMethod(), contract.getContractTerms());
        // adding the contract to the customer contracts list
        this.contractList.add(newContract);
        // changing the status the building type to true(rented)
        building.setRented(true);
        System.out.println("New contract created: ==> " + newContract);
        System.out.println("=======================================================================");

        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
