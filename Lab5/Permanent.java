public class Permanent implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public Contract buildContractID(String contractID) {
        this.contractID = contractID;
        return this;
    }

    @Override
    public Contract buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    @Override
    public Contract buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    @Override
    public Contract buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    @Override
    public Contract signContract() {
        System.out.println("Permanent Contract Signed: " + this);
        return this;
    }

    @Override
    public String toString() {
        return "Permanent [contractID=" + contractID + ", propertyID=" + propertyID +
                ", tenantID=" + tenantID + ", rentAmount=" + rentAmount + "]";
    }
}
