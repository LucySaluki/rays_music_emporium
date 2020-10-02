package Products.Instruments;

public class Flute extends Instrument {
    private int numberOfKeys;

    public Flute(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfKeys) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Toot";
    }
}
