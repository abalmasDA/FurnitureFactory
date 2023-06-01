public class SofaArtDeco implements Furniture {
    private String name = "\"Тихе місце\"";
    private double price = 4740.12;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }


}
