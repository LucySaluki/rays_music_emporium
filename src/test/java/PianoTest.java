import Products.Instruments.InstrumentType;
import Products.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    public Piano piano;

    @Before
    public void before(){
        piano= new Piano("PI001",500.00,1500.00, "Wood/Ivory",
                "Brown", InstrumentType.KEYBOARD,88,88);
    }
    @Test
    public void hasProductCode(){
        assertEquals("PI001",piano.getProductCode());
    }
    @Test
    public void hasBoughtPrice(){
        assertEquals(500.00,piano.getBoughtPrice(),0.01);
    }
    @Test
    public void hasSellingPrice(){
        assertEquals(1500.00,piano.getSellingPrice(),0.01);
    }
    @Test
    public void hasMaterial(){
        assertEquals("Wood/Ivory",piano.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Brown",piano.getColour());
    }
    @Test
    public void hasInstrumentType(){
        assertEquals("KEYBOARD",piano.getType().toString());
    }
    @Test
    public void hasNumberOfKeys(){
        assertEquals(88,piano.getNumberOfKeys());
    }
    @Test
    public void hasNumberOfString(){
        assertEquals(88,piano.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plink",piano.play());
    }

    @Test
    public void hasMarkUpValue(){
        assertEquals(1000.00, piano.calculateMarkup(),0.01);
    }
}
