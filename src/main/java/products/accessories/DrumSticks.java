package products.accessories;

import products.instruments.InstrumentTypes;

public class DrumSticks extends Accessory {

    private int weight;
    private String tipType;

    public DrumSticks(String productName, String manufacturer, double retailerPrice, double customerPrice, int weight, String tipType) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.PERCUSSION);
        this.weight = weight;
        this.tipType = tipType;
    }

    public int getWeight() {
        return weight;
    }

    public String getTipType() {
        return tipType;
    }

}
