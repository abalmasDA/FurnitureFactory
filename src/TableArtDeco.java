public class TableArtDeco implements Furniture {
    private String name = "\"Вдалий відпочинок\"";
    private double price = 1457;

    @Override
    public String getNameItem() {
        return name;

    }

    @Override
    public double getPriceItem() {
        return price;
    }
}
