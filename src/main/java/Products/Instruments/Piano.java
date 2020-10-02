package Products.Instruments;

public class Piano extends Instrument {
    private int numberOfKeys;
    private int numberOfStrings;

    public Piano(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfKeys, int numberOfStrings) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.numberOfKeys = numberOfKeys;
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "plink plink";
    }
}
