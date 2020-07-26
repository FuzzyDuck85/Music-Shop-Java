package products.instruments;

public class WoodwindType extends Instrument{

    private int numberOfToneHoles;
    private boolean hasReed;

    public WoodwindType(String productName, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, InstrumentTypes instrumentTypes,int numberOfToneHoles, boolean hasReed) {
        super(productName, manufacturer, retailerPrice, customerPrice, material, colour, InstrumentTypes.WOODWIND);
        this.numberOfToneHoles = numberOfToneHoles;
        this.hasReed = hasReed;
    }

    public boolean isHasReed() {
        return hasReed;
    }

    public int getNumberOfToneHoles() {
        return numberOfToneHoles;
    }

    public String play(){
        return "Blowing air, splitting it and manipulate use the tone holes to have a hoot!";
    };
}
