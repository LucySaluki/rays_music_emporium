import Products.Instruments.InstrumentType;
import Products.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    public Violin violin;

    @Before
    public void before(){
        violin= new Violin("VL001",100.00,150.00, "Wood",
                "Brown", InstrumentType.WIND,4);
    }
    @Test
    public void hasProductCode(){
        assertEquals("VL001",violin.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(100.00,violin.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(150.00,violin.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood",violin.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Brown",violin.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("WIND",violin.getType().toString());
    }
    @Test
    public void hasNumberOfString(){
        assertEquals(4,violin.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("*SoundLikeCatBeingStrangled*",violin.play());
    }

}
