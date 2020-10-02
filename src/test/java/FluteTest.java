import Products.Instruments.Flute;
import Products.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    public Flute flute;

    @Before
    public void before(){
        flute= new Flute("FL001",125.00,150.00, "Metal",
                "Silver", InstrumentType.WIND,12);
    }
    @Test
    public void hasProductCode(){
        assertEquals("FL001",flute.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(125.00,flute.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(150.00,flute.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Metal",flute.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Silver",flute.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("WIND",flute.getType().toString());
    }
    @Test
    public void hasNumberOfKeys(){
        assertEquals(12,flute.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("Toot",flute.play());
    }

    @Test
    public void hasMarkUpValue(){
        assertEquals(25.00, flute.calculateMarkup(),0.01);
    }
}
