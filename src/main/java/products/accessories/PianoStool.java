package products.accessories;

import products.instruments.InstrumentTypes;

public class PianoStool extends Accessory {

    private int size;
    private int noOfLegs;

    public PianoStool(String productName, String manufacturer, double retailerPrice, double customerPrice, int size, int noOfLegs) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.FURNITURE, InstrumentTypes.KEYBOARD);
        this.size = size;
        this.noOfLegs = noOfLegs;
    }

    public int getSize() {
        return size;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
