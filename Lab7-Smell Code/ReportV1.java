import java.util.List;

class Property {
    private final String name;
    private final double rentAmount;
    private final String ownerName;
    private final String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return String.format(
                "Property: %s\nRent Amount: $%.2f\nOwner: %s\nLocation: %s",
                name, rentAmount, ownerName, location);
    }
}

class PropertyAnalytics {
    public static boolean isPremium(double rentAmount) {
        return rentAmount > 2000;
    }

    public static double calculateYearlyRent(double rentAmount) {
        return rentAmount * 12;
    }
}

class FinancialReport {
    private final String reportTitle;
    private final List<Property> properties;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        double totalRent = 0;

        System.out.println("Financial Report: " + reportTitle);
        System.out.println("=============================");

        for (Property property : properties) {
            System.out.println(property);
            double yearlyRent = PropertyAnalytics.calculateYearlyRent(property.getRentAmount());
            totalRent += property.getRentAmount();

            System.out.println(
                    "Property Type: "
                            + (PropertyAnalytics.isPremium(property.getRentAmount()) ? "Premium" : "Standard"));
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("---------------------");
        }

        System.out.printf("Total Rent Amount: $%.2f%n", totalRent);
    }
}

public class ReportV1 {
    public static void main(String[] args) {
        Property property1 = new Property("Apartment A", 1500.0, "John Doe", "City Center");
        Property property2 = new Property("House B", 2500.0, "Jane Smith", "Suburb");
        Property property3 = new Property("Condo C", 1800.0, "Bob Johnson", "Downtown");

        FinancialReport financialReport = new FinancialReport(
                "Monthly Rent Summary",
                List.of(property1, property2, property3));
        financialReport.generateReport();
    }
}
