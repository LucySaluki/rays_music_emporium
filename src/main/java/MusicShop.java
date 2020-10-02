import Behaviours.ISellable;

import java.util.ArrayList;

public class MusicShop {
    private String shopName;
    private ArrayList<ISellable> products;

    public MusicShop(String shopName, ArrayList<ISellable> products) {
        this.shopName = shopName;
        this.products = products;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = "Ray's Music Exchange";
    }

    public ArrayList<ISellable> getProducts() {
        return products;
    }
}
