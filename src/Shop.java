public class Shop extends Building{
    private String shopType;
    private boolean hasStorageSpace;
    private boolean hasParking;

    public Shop(String name, double size, Address address, String shopType, boolean hasStorageSpace, boolean hasParking) {
        super(name, size, address);
        this.shopType = shopType;
        this.hasStorageSpace = hasStorageSpace;
        this.hasParking = hasParking;
    }
    @Override
    public double getRentingPrice() {
        double basePrice = getBuildingSize() * 20; // Base price per square meter

        // Add additional cost for storage space
        if (hasStorageSpace) {
            basePrice += 100; // Additional cost for storage space
        }

        // Add additional cost for parking
        if (hasParking) {
            basePrice += 150; // Additional cost for parking
        }

        return basePrice;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public boolean isHasStorageSpace() {
        return hasStorageSpace;
    }

    public void setHasStorageSpace(boolean hasStorageSpace) {
        this.hasStorageSpace = hasStorageSpace;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }
}
