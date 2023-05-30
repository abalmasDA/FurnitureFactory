public class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public String getInfoItem() {
        return "Столик - " + name + ", " + String.format("%.0f", price).replace(",", ".") + " грн.";
    }
}
