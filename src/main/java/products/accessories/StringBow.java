package products.accessories;

import products.instruments.InstrumentTypes;

public class StringBow extends Accessory {
    private String size;

    public StringBow(String productName, String manufacturer, double retailerPrice, double customerPrice , String size) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.STRING);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
