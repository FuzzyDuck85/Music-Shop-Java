package products.accessories;

import products.instruments.InstrumentTypes;

public class Reed extends Accessory {
    private String size;

    public Reed(String productName, String manufacturer, double retailerPrice, double customerPrice, String size) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.WOODWIND);
        this.size = size;
    }
}
