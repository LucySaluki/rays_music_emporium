package Products.Instruments;

public class Cymbal extends Instrument {
    private String sizeClass;

    public Cymbal(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, String sizeClass) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.sizeClass = sizeClass;
    }

    public String play() {
        return "tsshhh";
    }

    public String getSizeClass() {
        return sizeClass;
    }
}
