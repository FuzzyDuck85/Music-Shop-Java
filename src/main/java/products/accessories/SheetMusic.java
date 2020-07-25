package products.accessories;

import products.instruments.InstrumentTypes;

public class SheetMusic extends Accessory {

    private String author;
    private String genre;
    private int numOfPages;

    public SheetMusic(String productName, String manufacturer, double retailerPrice, double customerPrice, String author, String genre, int numOfPages) {
        super(productName, manufacturer, retailerPrice, customerPrice, AccessoryTypes.BOOK, InstrumentTypes.BRASS);
        this.author = author;
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
}
