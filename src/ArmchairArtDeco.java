public class ArmchairArtDeco implements Furniture {
    private String name = "\"Преміум\"";
    private double price = 5871;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }


}
