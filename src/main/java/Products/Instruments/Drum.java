package Products.Instruments;
import Behaviours.IPlayable;

public class Drum extends Instrument implements IPlayable {
    private String sizeClass;

    public Drum(String material, String colour, InstrumentType type, double boughtPrice, double sellingPrice, String sizeClass) {
        super(material, colour, type, boughtPrice, sellingPrice);
        this.sizeClass = sizeClass;
    }

    public String play() {
        return "Ba dum";
    }
}
