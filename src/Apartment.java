public class Apartment extends Building{
    private int numsOfRooms;
    private int numsOfBathrooms;
    private int floorNumber;
    private boolean hasBalcony;
    private boolean hasParkingSpace;

    public Apartment(String name, double size, Address address, int numsOfRooms, int numsOfBathrooms, int floorNumber, boolean hasBalcony, boolean hasParkingSpace) {
        super(name, size, address);
        this.numsOfRooms = numsOfRooms;
        this.numsOfBathrooms = numsOfBathrooms;
        this.floorNumber = floorNumber;
        this.hasBalcony = hasBalcony;
        this.hasParkingSpace = hasParkingSpace;
    }

    public int getNumsOfRooms() {
        return numsOfRooms;
    }

    public void setNumsOfRooms(int numsOfRooms) {
        this.numsOfRooms = numsOfRooms;
    }

    public int getNumsOfBathrooms() {
        return numsOfBathrooms;
    }

    public void setNumsOfBathrooms(int numsOfBathrooms) {
        this.numsOfBathrooms = numsOfBathrooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasParkingSpace() {
        return hasParkingSpace;
    }

    public void setHasParkingSpace(boolean hasParkingSpace) {
        this.hasParkingSpace = hasParkingSpace;
    }
    // this function is for rent calcualtions for the appartment based on its size and the number of rooms
    @Override
    public double getRentingPrice() {
        double basePrice = getBuildingSize() * 10;
        basePrice += numsOfRooms * 50;
        basePrice += numsOfBathrooms * 30;
        if (hasBalcony) {
            basePrice += 50;
        }
        if (hasParkingSpace) {
            basePrice += 100;
        }
        return basePrice;
    }
}
