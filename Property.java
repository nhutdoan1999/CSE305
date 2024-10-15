public class Property {
    // Attributes
    private String propertyID;
    private String description;
    private String propertyOwnerId;

    // Constructor
    public Property(String propertyID, String description, String propertyOwnerId) {
        this.propertyID = propertyID;
        this.description = description;
        this.propertyOwnerId = propertyOwnerId;
    }

    // Method to create a property (register)
    public static Property createProperty(String propertyID, String description, String propertyOwnerId) {
        return new Property(propertyID, description, propertyOwnerId);
    }

    // Getters and Setters
    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropertyOwnerId() {
        return propertyOwnerId;
    }

    public void setPropertyOwnerId(String propertyOwnerId) {
        this.propertyOwnerId = propertyOwnerId;
    }

    // toString method for displaying property information
    @Override
    public String toString() {
        return "Property{" +
                "propertyID='" + propertyID + '\'' +
                ", description='" + description + '\'' +
                ", propertyOwnerId='" + propertyOwnerId + '\'' +
                '}';
    }

    // Main method
    public static void main(String[] args) {
        // Create a new property
        Property property = Property.createProperty("P001", "Hello World", "U001");

        // Display property information
        System.out.println(property);
    }
}
