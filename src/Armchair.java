public class Armchair implements Furniture {
    private String name;
    private double price;

    public Armchair(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getInfoItem() {
        System.out.println("Крісло - " + name + ", " + String.format("%.0f", price).replace(",", ".") + " грн.");
    }


}
