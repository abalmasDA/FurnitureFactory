public class Sofa implements Furniture {
    private String name;
    private double price;

    public Sofa(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getInfoItem() {
        System.out.println("Диван - " + name + ", " + price + " грн.");
    }


}
