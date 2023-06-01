public class SofaVictorian implements Furniture {
    private String name = "\"Мудрість віків\"";
    private double price = 7340.57;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }

}
