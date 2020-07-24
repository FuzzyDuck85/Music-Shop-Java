package products.instruments;

public class KeyboardType extends Instrument{

    private int numberOfKeys;

    public KeyboardType(String productName, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, int numberOfKeys) {
        super(productName, manufacturer, retailerPrice, customerPrice, material, colour, InstrumentTypes.KEYBOARD);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "I make a plink, plonk sound when you strike my keys";
    };
}
