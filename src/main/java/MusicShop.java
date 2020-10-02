import Behaviours.ISellable;
import Products.Product;

import java.util.ArrayList;

public class MusicShop {
    private String shopName;
    private ArrayList<ISellable> stock;

    public MusicShop(String shopName) {
        this.shopName = shopName;
        this.stock = new  ArrayList<>();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ArrayList<ISellable> getStock() {
        return stock;
    }

    public void addProduct(ISellable item){
        stock.add(item);
    }

    public void removeProduct(ISellable item){
        stock.remove(item);
    }

    public double calculateTotalMarkup(){
        double totalMarkup = 0;
        for(ISellable product:this.stock){
            totalMarkup += product.calculateMarkup();
        } return totalMarkup;
    }
}
