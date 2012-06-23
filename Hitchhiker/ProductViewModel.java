package hitchhiker;

public class ProductViewModel {
    private final String name;
    private final String description;
    private final Manufacturer manufacturer;
    private final boolean isUserAdmin;

    public ProductViewModel(String name, String description, Manufacturer manufacturer, boolean userAdmin) {
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        isUserAdmin = userAdmin;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public boolean isUserAdmin() {
        return isUserAdmin;
    }
}

