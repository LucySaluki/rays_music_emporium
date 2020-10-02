package Products.Instruments;

import Behaviours.IPlayable;

public class Piano extends Instrument implements IPlayable {
    private int numberOfKeys;
    private int numberOfStrings;

    public Piano(String material, String colour, InstrumentType type, double boughtPrice, double sellingPrice, int numberOfKeys, int numberOfStrings) {
        super(material, colour, type, boughtPrice, sellingPrice);
        this.numberOfKeys=numberOfKeys;
        this.numberOfStrings=numberOfStrings;
    }

    public String play() {
        return "plink plink";
    }
}
