import interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double profit;
    private ArrayList<ISell> stock;

    public MusicShop(String name, double till){
        this.name = name;
        this.profit = profit;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addProductToStock(ISell product){
        this.stock.add(product);
    }

    public void removeProductFromStock(ISell product){
        this.stock.remove(product);
    }

    public double calculateTotalProfits(){
        double profits = 0;
        for (ISell product :this.stock){
            profits += product.calculateMarkup();
        }
        return profits;
    }
}
