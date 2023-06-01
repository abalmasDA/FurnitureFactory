public class FurnitureFactoryVictorian implements FurnitureFactory {

    @Override
    public Furniture createArmchair() {
        Furniture furniture = new ArmchairVictorian();
        return furniture;
    }

    @Override
    public Furniture createSofa() {
        Furniture furniture = new SofaVictorian();
        return furniture;
    }

    @Override
    public Furniture createTable() {
        Furniture furniture = new TableVictorian();
        return furniture;
    }

}
