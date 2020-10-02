import Products.Accessories.Accessory;
import Products.Accessories.AccessoryType;
import Products.Instruments.Cymbal;
import Products.Instruments.Drum;
import Products.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {
    private MusicShop musicShop;
    private Cymbal cymbal;
    private Drum drum;
    private Accessory sheetMusic;

    @Before
    public void before(){
        musicShop= new MusicShop("Ray's Music Exchange");
        cymbal= new Cymbal("CY001",75.00,100.00, "Metal",
                "Silver", InstrumentType.PERCUSSION,"Crash cymbal");
        drum= new Drum("DR001",75.00,150.00, "Wood/Metal/Skin",
                "Silver", InstrumentType.PERCUSSION,"Kettledrum");
        sheetMusic=new Accessory("SM001",0.75,1.5,
                AccessoryType.SHEET_MUSIC,"Adagio for Strings - Samuel Barber");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", musicShop.getShopName());
    }

    @Test
    public void canAddProduct(){
        musicShop.addProduct(cymbal);
        musicShop.addProduct(drum);
        musicShop.addProduct(sheetMusic);
        assertEquals(3,musicShop.getStock().size());
    }

    @Test
    public void canRemoveProduct(){
        musicShop.addProduct(drum);
        musicShop.addProduct(sheetMusic);
        musicShop.removeProduct(sheetMusic);
        assertEquals(1,musicShop.getStock().size());
    }

    @Test
    public void canGetTotalMarkup(){
        musicShop.addProduct(cymbal);
        musicShop.addProduct(drum);
        musicShop.addProduct(sheetMusic);
        assertEquals(100.75,musicShop.calculateTotalMarkup(),0.01);
    }
}
