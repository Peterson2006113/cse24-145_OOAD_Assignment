package bankingsystem.model;

public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;
    private String employer;

    public IndividualCustomer(String id, String address, String firstName, String lastName, String employer) {
        super(id, address);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employer = employer;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmployer() { return employer; }
}
