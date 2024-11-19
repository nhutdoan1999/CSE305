public class Client {
    public static void main(String[] args) {
        // Create a Permanent Contract
        Contract permanentContract = new Permanent()
                .buildContractID("P001")
                .buildPropertyID("PR001")
                .buildTenantID("T001")
                .buildRentAmount(1500.00)
                .signContract();

        // Create a Long-Term Contract
        Contract longTermContract = new LongTerm()
                .buildContractID("L001")
                .buildPropertyID("PR002")
                .buildTenantID("T002")
                .buildRentAmount(1200.00)
                .signContract();

        // Create a Short-Term Contract
        Contract shortTermContract = new ShortTerm()
                .buildContractID("S001")
                .buildPropertyID("PR003")
                .buildTenantID("T003")
                .buildRentAmount(800.00)
                .signContract();
    }
}
