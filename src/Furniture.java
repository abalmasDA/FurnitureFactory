public abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getInfoItem();


}
