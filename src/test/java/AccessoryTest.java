import Products.Accessories.Accessory;
import Products.Accessories.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {
    private Accessory drumsticks;

    @Before
    public void before(){
        drumsticks=new Accessory("DR_ST001",1.5,2.0,
                AccessoryType.DRUM_STICKS,"Standard wooden drumsticks, pair.");
    }

    @Test
    public void hasProductCode() {
        assertEquals("DR_ST001", drumsticks.getProductCode());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(1.50, drumsticks.getBoughtPrice(),0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2.00, drumsticks.getSellingPrice(),0.01);
    }
    @Test
    public void hasAccessoryType() {
        assertEquals("DRUM_STICKS", drumsticks.getAccessoryType().toString());
    }
    @Test
    public void hasDescription() {
        assertEquals("Standard wooden drumsticks, pair.", drumsticks.getDescription());
    }

    @Test
    public void hasMarkUpValue(){
        assertEquals(0.50, drumsticks.calculateMarkup(),0.01);
    }
}
