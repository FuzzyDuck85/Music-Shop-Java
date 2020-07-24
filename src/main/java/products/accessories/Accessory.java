package products.accessories;


import products.Product;
import products.instruments.InstrumentTypes;

public abstract class Accessory extends Product {


    private InstrumentTypes instrumentTypes;
    private AccessoryTypes accessoryTypes;

    public Accessory(String productName, String manufacturer, double retailerPrice, double customerPrice, AccessoryTypes accessoryTypes, InstrumentTypes instrumentTypes) {
        super(productName, manufacturer, retailerPrice, customerPrice);

        this.instrumentTypes = instrumentTypes;
        this.accessoryTypes = accessoryTypes;
    }


    public InstrumentTypes getInstrumentTypes() {
        return instrumentTypes;
    }
}
