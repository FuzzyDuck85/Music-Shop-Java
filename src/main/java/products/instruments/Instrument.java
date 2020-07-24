package products.instruments;

import interfaces.IPlay;
import products.Product;

public abstract class Instrument extends Product implements IPlay {

    private String material;
    private String colour;
    private InstrumentTypes instrumentType;


    public Instrument(String productName, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, InstrumentTypes instrumentType){
        super(productName, manufacturer, retailerPrice, customerPrice);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentTypes getType(){
        return instrumentType;
    }

    public String play(){
        return null;
    }
}
