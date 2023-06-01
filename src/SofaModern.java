public class SofaModern implements Furniture {
    private String name = "\"Гіпер портал\"";
    private double price = 5340.17;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }


}
