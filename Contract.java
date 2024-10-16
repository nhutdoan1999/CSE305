public class Contract {

    // Attributes
    private String contractId;
    private String propertyID;
    private String tenantId;
    private double rentAmount;

    // Constructor
    public Contract(String contractId, String propertyID, String tenantId, double rentAmount) {
        this.contractId = contractId;
        this.propertyID = propertyID;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
    }

    // Getter and Setter
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    // Create Contract
    public Contract createContract(String contractId, String propertyID, String tenantId, double rentAmount) {
        Contract contract = new Contract(contractId, propertyID, tenantId, rentAmount);
        return contract;
    }

    // Terminate Contract
    public String terminateContract() {
        return "Terminate Contract successfully";
    }
}
