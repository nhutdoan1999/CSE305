import java.util.ArrayList;
import java.util.List;

/**
 * Tenant
 */
public class Tenant {

    // Attribute
    private User user;
    private List<Contract> listOfContract;

    // Constructor
    public Tenant(User user) {
        this.user = user;
        this.listOfContract = new ArrayList<Contract>();
    }

    // Getter and Setter
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Contract> getListOfContract() {
        return listOfContract;
    }

    public void setListOfContract(List<Contract> listOfContract) {
        this.listOfContract = listOfContract;
    }

    // Request create rental contract
    public Contract requestCreateRentalContract(String contractId, String propertyID, String tenantId,
            double rentAmount) {
        Contract contract = Contract.createContract(contractId, propertyID, tenantId, rentAmount);
        listOfContract.add(contract);
        return contract;
    }

    // Request terminate rental contract
    public String requestTerminateRentalContract(String contractId) {
        for (var contract : listOfContract) {
            if (contractId == contract.getContractId()) {
                listOfContract.remove(contract);
                return contract.terminateContract();
            }
        }
        return "Cannot find contract";
    }

}