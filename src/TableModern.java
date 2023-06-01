public class TableModern implements Furniture {
    private String name = "\"Пульт керування\"";
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
