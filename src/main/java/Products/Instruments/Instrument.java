package Products.Instruments;

public abstract class Instrument {
    public String material;
    public String colour;
    public double boughtPrice;
    public double sellingPrice;

    public Instrument(String material, String colour, double boughtPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
