package Products.Accessories;
import Products.Product;

public class Accessory extends Product {
    private AccessoryType accessoryType;
    private String description;

    public Accessory(String productCode, double boughtPrice, double sellingPrice, AccessoryType accessoryType, String description) {
        super(productCode, boughtPrice, sellingPrice);
        this.accessoryType = accessoryType;
        this.description = description;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public String getDescription() {
        return description;
    }


}
