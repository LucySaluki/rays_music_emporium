import Products.Instruments.InstrumentType;
import Products.Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    public Trumpet trumpet;

    @Before
    public void before(){
        trumpet= new Trumpet("TP001",150.00,250.00, "Brass",
                "Gold", InstrumentType.BRASS,3);
    }
    @Test
    public void hasProductCode(){
        assertEquals("TP001",trumpet.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(150.00,trumpet.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(250.00,trumpet.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Brass",trumpet.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Gold",trumpet.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("BRASS",trumpet.getType().toString());
    }
    @Test
    public void hasNumberOfString(){
        assertEquals(3,trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("paarp",trumpet.play());
    }

}
