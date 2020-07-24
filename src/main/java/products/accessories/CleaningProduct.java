package products.accessories;

import products.Product;
import products.instruments.InstrumentTypes;

public class CleaningProduct extends Accessory {
    private int volume;

    public CleaningProduct(String productName, String manufacturer, double retailerPrice, double customerPrice, int volume) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.MAINTAIN, InstrumentTypes.BRASS);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
