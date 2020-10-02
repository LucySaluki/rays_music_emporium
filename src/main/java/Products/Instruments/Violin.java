package Products.Instruments;

import Behaviours.IPlayable;

public class Violin extends Instrument implements IPlayable {
    private int numberOfStrings;

    public Violin(String material, String colour, InstrumentType type, double boughtPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, type, boughtPrice, sellingPrice);
        this.numberOfStrings=numberOfStrings;
    }

    public String play() {
        return "*SoundLikeCatBeingStrangled*";
    }
}
