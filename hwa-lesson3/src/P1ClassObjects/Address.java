package P1ClassObjects;

public class Address {
    //street, city, state and zip
    private String street;
    private String city;
    private String state;
    private String zip;

    //Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Getter for city (needed for the Chicago check)
    public String getCity() {
        return this.city;
    }

}
