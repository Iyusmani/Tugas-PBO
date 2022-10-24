public class Person {
    private String name, address;

    protected Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected String getName() {
        return this.name;
    }

    protected String getAddress() {
        return this.address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "Nama : " + getName() + "\nAddress : " + getAddress();
    }
}
