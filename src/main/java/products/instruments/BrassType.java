package products.instruments;

public class BrassType extends Instrument{

    private int numberOfValves;

    public BrassType(String productName, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, InstrumentTypes instrumentTypes, int numberOfValves) {
        super(productName, manufacturer, retailerPrice, customerPrice, material, colour, InstrumentTypes.BRASS);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Purse your lips, blow and manipulate the values to make loud noises!";
    };

}
