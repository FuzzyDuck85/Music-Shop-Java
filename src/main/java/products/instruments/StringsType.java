package products.instruments;


public class StringsType extends Instrument {

    private int numberOfStrings;

    public StringsType(String make, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, InstrumentTypes instrumentType, int numberOfStrings){
        super(make, manufacturer, retailerPrice, customerPrice, material, colour, instrumentType.STRING);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Pluck and squeeze my strings to make sweet music!";
    }

}
