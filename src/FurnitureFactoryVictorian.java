public class FurnitureFactoryVictorian implements FurnitureFactory {
    private String nameArmchairVictorian = "\"Тиха гавань\"";
    private String nameSofaVictorian = "\"Мудрість віків\"";
    private String nameTableVictorian = "\"Місце роздумів\"";
    private double priceArmchairVictorian = 2340;
    private double priceSofaVictorian = 7340.57;
    private double priceTableVictorian = 4340;

    @Override
    public void createArmchair() {
        Furniture furniture = new Armchair(nameArmchairVictorian, priceArmchairVictorian);
        furniture.getInfoItem();
    }

    @Override
    public void createSofa() {
        Furniture furniture = new Sofa(nameSofaVictorian, priceSofaVictorian);
        furniture.getInfoItem();
    }

    @Override
    public void createTable() {
        Furniture furniture = new Table(nameTableVictorian, priceTableVictorian);
        furniture.getInfoItem();
    }

    @Override
    public void getTotalSumFurniture() {
        System.out.println("Загальна сума: " + (priceArmchairVictorian + priceSofaVictorian + priceTableVictorian) + " грн.");
    }
}
