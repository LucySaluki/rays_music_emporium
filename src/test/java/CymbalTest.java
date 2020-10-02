import Products.Instruments.Cymbal;
import Products.Instruments.Drum;
import Products.Instruments.InstrumentType;
import Products.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CymbalTest {
    public Cymbal cymbal;

    @Before
    public void before(){
        cymbal= new Cymbal("CY001",75.00,100.00, "Metal",
                "Silver", InstrumentType.PERCUSSION,"Crash cymbal");
    }
    @Test
    public void hasProductCode(){
        assertEquals("CY001",cymbal.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(75.00,cymbal.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(100.00,cymbal.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Metal",cymbal.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Silver",cymbal.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("PERCUSSION",cymbal.getType().toString());
    }
    @Test
    public void hasSizeClass(){
        assertEquals("Crash cymbal",cymbal.getSizeClass());
    }

    @Test
    public void canPlay(){
        assertEquals("tsshhh",cymbal.play());}}
