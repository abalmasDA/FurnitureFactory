public class TableVictorian implements Furniture {
    private String name = "\"Місце роздумів\"";
    private double price = 4340;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }

}
