public class FurnitureFactoryArtDeco implements FurnitureFactory {
    private String nameArmchairArtDeco = "\"Преміум\"";
    private String nameSofaArtDeco = "\"Тихе місце\"";
    private String nameTableArtDeco = "\"Вдалий відпочинок\"";
    private double priceArmchairArtDeco = 5871;
    private double priceSofaArtDeco = 4740.12;
    private double priceTableArtDeco = 1287;

    @Override
    public void createArmchair() {
        Furniture furniture = new Armchair(nameArmchairArtDeco, priceArmchairArtDeco);
        furniture.getInfoItem();

    }

    @Override
    public void createSofa() {
        Furniture furniture = new Sofa(nameSofaArtDeco, priceSofaArtDeco);
        furniture.getInfoItem();
    }

    @Override
    public void createTable() {
        Furniture furniture = new Table(nameTableArtDeco, priceTableArtDeco);
        furniture.getInfoItem();
    }

    @Override
    public void getTotalSumFurniture() {
        System.out.println("Загальна сума: " + String.format("%.2f", (priceArmchairArtDeco + priceSofaArtDeco + priceTableArtDeco)).replace(",", ".") + " грн.");

    }
}
