package Products.Instruments;

import Behaviours.IPlayable;

public class Flute extends Instrument implements IPlayable {
    private int numberOfKeys;

    public Flute(String material, String colour, InstrumentType type, double boughtPrice, double sellingPrice, int numberOfKeys) {
        super(material, colour, type, boughtPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public String play() {
        return "Toot";
    }
}
