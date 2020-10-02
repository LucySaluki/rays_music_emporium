import Products.Instruments.Guitar;
import Products.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    public Guitar guitar;

    @Before
    public void before(){
        guitar= new Guitar("GU001",100.00,200.00, "Wood/Metal",
                "Blue", InstrumentType.STRING,4);
    }
    @Test
    public void hasProductCode(){
        assertEquals("GU001",guitar.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(100.00,guitar.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(200.00,guitar.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood/Metal",guitar.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Blue",guitar.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("STRING",guitar.getType().toString());
    }
    @Test
    public void hasNumberOfString(){
        assertEquals(4,guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("dling ding ding",guitar.play());
    }

}
