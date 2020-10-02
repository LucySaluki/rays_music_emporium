package Products.Instruments;

public class Drum extends Instrument {
    private String sizeClass;

    public Drum(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, String sizeClass) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.sizeClass = sizeClass;
    }

    public String getSizeClass() {
        return sizeClass;
    }

    public String play() {
        return "Ba dum";
    }
}
