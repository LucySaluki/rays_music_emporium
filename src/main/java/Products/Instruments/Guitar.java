package Products.Instruments;

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfStrings) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "dling ding ding";
    }}
