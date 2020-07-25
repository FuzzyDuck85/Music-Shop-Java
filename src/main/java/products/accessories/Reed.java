package products.accessories;

import products.instruments.InstrumentTypes;

public class Reed extends Accessory {
    private String material;

    public Reed(String productName, String manufacturer, double retailerPrice, double customerPrice, String material) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.WOODWIND);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
