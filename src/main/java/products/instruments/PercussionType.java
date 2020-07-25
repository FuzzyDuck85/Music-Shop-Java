package products.instruments;

public class PercussionType extends Instrument{
    private boolean requiresStick;

    public PercussionType(String productName, String manufacturer, double retailerPrice, double customerPrice, String material, String colour, boolean requiresStick) {
        super(productName, manufacturer, retailerPrice, customerPrice, material, colour, InstrumentTypes.KEYBOARD);
        this.requiresStick = requiresStick;
    }

    public boolean isRequiresStick() {
        return requiresStick;
    }

    public String play(){
        return "Clash, Boom, Bang, Ting!";
    };
}
