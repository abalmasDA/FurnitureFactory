public class Table implements Furniture {
    private String name;
    private double price;

    public Table(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getInfoItem() {
        System.out.println("Столик - " + name + ", " + String.format("%.0f", price).replace(",", ".") + " грн.");
    }


}
