package bankingsystem.model;

public class CompanyCustomer extends Customer {
    private String companyName;
    private String registrationNumber;

    public CompanyCustomer(String id, String address, String companyName, String registrationNumber) {
        super(id, address);
        this.companyName = companyName;
        this.registrationNumber = registrationNumber;
    }

    public String getCompanyName() { return companyName; }
}
