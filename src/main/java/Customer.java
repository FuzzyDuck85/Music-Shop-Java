import products.Product;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Product> products;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getProductCount(){
        return this.products.size();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void buyProduct(Product product){
        addProduct(product);
        this.money -= product.getCustomerPrice();
    }
}
