package products.accessories;

import products.instruments.InstrumentTypes;

public class GuitarPick extends Accessory {

    private int packQuantity;
    private String thickness;

    public GuitarPick(String productName, String manufacturer, double retailerPrice, double customerPrice, int packQuantity, String thickness) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.STRING);
        this.packQuantity = packQuantity;
        this.thickness = thickness;
    }

    public int getPackQuantity() {
        return packQuantity;
    }

    public String getThickness() {
        return thickness;
    }
}
