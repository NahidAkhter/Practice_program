package EqualsAndHashcode.emp;

import java.util.Objects;

public class Address {

    private long houseNumber;
    private String streetName;
    private String city;
    private long pincode;

    public Address(long houseNumber, String streetName, String city, long pincode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public long getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(long houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber &&
                pincode == address.pincode &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, streetName, city, pincode);
    }
}
