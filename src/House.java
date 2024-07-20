public class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private boolean hasGarden;
    private boolean hasSwimmingPool;
    private boolean hasFirePlace;

    public House(String name, double size, Address address, int numberOfBedrooms, int numberOfBathrooms, boolean hasGarden, boolean hasSwimmingPool, boolean hasFirePlace) {
        super(name, size, address);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.hasGarden = hasGarden;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasFirePlace = hasFirePlace;
    }

    @Override
    public double getRentingPrice() {
        double basePrice = getBuildingSize() * 10;
        basePrice += numberOfBedrooms * 50;
        basePrice += numberOfBathrooms * 30;

        if (hasGarden) {
            basePrice += 100; // Additional cost if the house has a garden
        }

        if (hasSwimmingPool) {
            basePrice += 200; // Additional cost if the house has a swimming pool
        }

        if (hasFirePlace) {
            basePrice += 50; // Additional cost if the house has a fireplace
        }

        return basePrice;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public boolean isHasFirePlace() {
        return hasFirePlace;
    }

    public void setHasFirePlace(boolean hasFirePlace) {
        this.hasFirePlace = hasFirePlace;
    }

}
