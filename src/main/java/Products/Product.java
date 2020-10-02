package Products;

import Behaviours.ISellable;

public abstract class Product implements ISellable {
    public String productCode;
    public double boughtPrice;
    public double sellingPrice;

    public Product(String productCode, double boughtPrice, double sellingPrice) {
        this.productCode = productCode;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice-this.boughtPrice;
    }
}
