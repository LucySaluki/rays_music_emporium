package Products.Instruments;

public class Violin extends Instrument {
    private int numberOfStrings;

    public Violin(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfStrings) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "*SoundLikeCatBeingStrangled*";
    }
}
