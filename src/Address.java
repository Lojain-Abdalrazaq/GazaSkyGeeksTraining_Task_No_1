public class Address {
    private String streetName;
    private String cityName;
    private String county;

    public Address(String streetName, String cityName, String country){
        this.streetName = streetName;
        this.cityName = cityName;
        this.county = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
