package bankingsystem.model;

public abstract class Customer {
    protected String customerId;
    protected String address;

    public Customer(String customerId, String address) {
        this.customerId = customerId;
        this.address = address;
    }

    public String getCustomerId() { return customerId; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return customerId + " | " + address;
    }
}
