import Products.Instruments.Drum;
import Products.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    public Drum drum;

    @Before
    public void before(){
        drum= new Drum("DR001",75.00,150.00, "Wood/Metal/Skin",
                "Silver", InstrumentType.PERCUSSION,"Kettledrum");
    }
    @Test
    public void hasProductCode(){
        assertEquals("DR001",drum.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(75.00,drum.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(150.00,drum.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood/Metal/Skin",drum.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Silver",drum.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("PERCUSSION",drum.getType().toString());
    }
    @Test
    public void hasSizeClass(){
        assertEquals("Kettledrum",drum.getSizeClass());
    }

    @Test
    public void canPlay(){
        assertEquals("Ba dum",drum.play());
    }

    @Test
    public void hasMarkUpValue(){
        assertEquals(75.00, drum.calculateMarkup(),0.01);
    }
}
