public class Address {
    String city;
    String street;
    int hausNum;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHausNum() {
        return hausNum;
    }

    public void setHausNum(int hausNum) {
        this.hausNum = hausNum;
    }

    public Address() {
    }

    public Address(String city, String street, int hausNum) {
        this.city = city;
        this.street = street;
        this.hausNum = hausNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", hausNum=" + hausNum +
                '}';
    }
}
