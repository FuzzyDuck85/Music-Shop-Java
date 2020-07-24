package products.accessories;

import products.instruments.InstrumentTypes;

public class Metronome extends Accessory {
    private boolean isDigital;

    public Metronome(String productName, String manufacturer, double retailerPrice, double customerPrice, boolean isDigital) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.SPARES, InstrumentTypes.STRING);
        this.isDigital = isDigital;
    }

    public boolean isDigital() {
        return isDigital;
    }
}
