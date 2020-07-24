import interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public MusicShop(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addProductToStock(ISell product){
        this.stock.add(product);
    }

    public void removeProductFromStock(ISell product){
        this.stock.remove(product);
    }

    public double calculateProfits(){
        double profits = 0;
        for (ISell product :this.stock){
            profits += product.calculateMarkup();
        }
        return profits;
    }
}
