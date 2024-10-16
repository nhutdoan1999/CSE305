import java.util.ArrayList;
import java.util.List;

class Property {
    private String propertyName;
    private String location;

    public Property(String propertyName, String location) {
        this.propertyName = propertyName;
        this.location = location;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Property{propertyName='" + propertyName + "', location='" + location + "'}";
    }
}

class PropertyOwner {
    private User owner;
    private List<Property> listOfProperties;

    public PropertyOwner(User owner) {
        this.owner = owner;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
        System.out.println(property.getPropertyName() + " added successfully.");
    }

    public void removeProperty(Property property) {
        if (listOfProperties.remove(property)) {
            System.out.println(property.getPropertyName() + " removed successfully.");
        } else {
            System.out.println(property.getPropertyName() + " not found.");
        }
    }

    public void displayProperties() {
        if (listOfProperties.isEmpty()) {
            System.out.println("No properties owned.");
        } else {
            System.out.println("Properties owned by " + owner.getUsername() + ":");
            for (Property property : listOfProperties) {
                System.out.println(property);
            }
        }
    }
}
