package products.accessories;

import products.instruments.InstrumentTypes;

public class SheetMusic extends Accessory {

    private String genre;
    private int numOfPages;

    public SheetMusic(String productName, String manufacturer, double retailerPrice, double customerPrice, String genre, int numOfPages) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.BOOK, InstrumentTypes.BRASS);
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
