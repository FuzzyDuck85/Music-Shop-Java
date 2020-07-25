package products.accessories;

import products.instruments.InstrumentTypes;

public class PianoStool extends Accessory {

    private boolean adjustable;
    private int noOfLegs;
    private boolean hasStorage;

    public PianoStool(String productName, String manufacturer, double retailerPrice, double customerPrice, boolean adjustable, int noOfLegs, boolean hasStorage) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.FURNITURE, InstrumentTypes.KEYBOARD);
        this.adjustable = adjustable;
        this.noOfLegs = noOfLegs;
        this.hasStorage = hasStorage;
    }

    public boolean isAdjustable() {
        return adjustable;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public boolean isHasStorage() {
        return hasStorage;
    }
}
