public class Sofa extends Furniture {
    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public String getInfoItem() {
        return "Диван - " + name + ", " + price + " грн.";
    }
}
