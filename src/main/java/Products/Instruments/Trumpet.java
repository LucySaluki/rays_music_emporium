package Products.Instruments;

public class Trumpet extends Instrument {
    public int numberOfValves;

    public Trumpet(String productCode, double boughtPrice, double sellingPrice, String material, String colour, InstrumentType type, int numberOfValves) {
        super(productCode, boughtPrice, sellingPrice, material, colour, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "paarp";
    }
}
