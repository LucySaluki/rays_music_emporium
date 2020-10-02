package Products.Instruments;

import Behaviours.IPlayable;

public class Trumpet extends Instrument implements IPlayable {
    public int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double boughtPrice, double sellingPrice, int numberOfValves) {
        super(material, colour, type, boughtPrice, sellingPrice);
        this.numberOfValves=numberOfValves;
    }

    public String play() {
        return "paarp";
    }
}
