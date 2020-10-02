package Products.Instruments;
import Behaviours.IPlayable;
import Products.Product;

public abstract class Instrument extends Product implements IPlayable {
    public String material;
    public String colour;
    public InstrumentType type;

    public Instrument(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type) {
        super(productCode, boughtPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public abstract String play();

}
