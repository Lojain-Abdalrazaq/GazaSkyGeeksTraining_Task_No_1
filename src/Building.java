public abstract class Building {
    private String buildingName;
    private double buildingSize; // in meters^2
    private Address buildingAddress;
    private boolean isRented;

    public Building(String buildingName,double buildingSize,Address buildingAddress){
        this.buildingName = buildingName;
        this.buildingSize = buildingSize;
        this.buildingAddress =  buildingAddress;
        isRented = false; // by default, the building either it was house, apartment, etc will be intially not rented.

    }

    public double getBuildingSize() {
        return buildingSize;
    }

    public void setBuildingSize(double buildingSize) {
        this.buildingSize = buildingSize;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Address getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(Address buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
    // abstract class to calcualte the renting price
    public abstract double getRentingPrice();
}

