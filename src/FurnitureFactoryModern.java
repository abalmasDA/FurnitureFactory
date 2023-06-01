public class FurnitureFactoryModern implements FurnitureFactory {
    private String nameArmchairModern = "\"Стар швіп\"";
    private String nameSofaModern = "\"Гіпер портал\"";
    private String nameTableModern = "\"Пульт керування\"";
    private double priceArmchairModern = 1340;
    private double priceSofaModern = 5340.17;
    private double priceTableModern = 4340;

    @Override
    public void createArmchair() {
        Furniture furniture = new Armchair(nameArmchairModern, priceArmchairModern);
        furniture.getInfoItem();
    }

    @Override
    public void createSofa() {
        Furniture furniture = new Sofa(nameSofaModern, priceSofaModern);
        furniture.getInfoItem();
    }

    @Override
    public void createTable() {
        Furniture furniture = new Table(nameTableModern, priceTableModern);
        furniture.getInfoItem();
    }

    @Override
    public void getTotalSumFurniture() {
        System.out.println("Загальна сума: " + (priceArmchairModern + priceSofaModern + priceTableModern) + " грн.");

    }

}
