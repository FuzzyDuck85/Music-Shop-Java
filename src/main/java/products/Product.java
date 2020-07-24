package products;

import interfaces.ISell;

public class Product implements ISell {
    private String productName;
    private String manufacturer;
    private double retailerPrice;
    private double customerPrice;

    public Product(String productName, String manufacturer, double retailerPrice, double customerPrice){
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.retailerPrice = retailerPrice;
        this.customerPrice = customerPrice;
    }

    public String getMake() {
        return productName;
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getRetailerPrice() {
        return retailerPrice;
    }

    public double getCustomerPrice() {
        return customerPrice;
    }

    public double calculateMarkup(){
        return this.customerPrice - this.retailerPrice;
    }
}
