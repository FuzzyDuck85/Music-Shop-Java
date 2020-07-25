package products.accessories;

import products.instruments.InstrumentTypes;

public class StringBow extends Accessory {
    private String size;
    private String frogMaterial;
    private boolean naturalHair;

    public StringBow(String productName, String manufacturer, double retailerPrice, double customerPrice , String size, String frogMaterial, boolean naturalHair) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.STRING);
        this.size = size;
        this.frogMaterial = frogMaterial;
        this.naturalHair = naturalHair;
    }

    public String getSize() {
        return size;
    }

    public String getFrogMaterial() {
        return frogMaterial;
    }

    public boolean isNaturalHair() {
        return naturalHair;
    }
}
