public class Armchair extends Furniture {

    public Armchair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getInfoItem() {
        return "Крісло - " + name + ", " + String.format("%.0f", price).replace(",", ".") + " грн.";
    }
}
