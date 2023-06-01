public class ArmchairVictorian implements Furniture {
    private String name = "\"Тиха гавань\"";
    private double price = 2340;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }
}
