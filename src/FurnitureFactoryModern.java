public class FurnitureFactoryModern implements FurnitureFactory {

    @Override
    public Furniture createArmchair() {
         Furniture furniture = new ArmchairModern();
        return furniture;
    }

    @Override
    public Furniture createSofa() {
        Furniture furniture = new SofaModern();
        return furniture;
    }

    @Override
    public Furniture createTable() {
        Furniture furniture = new TableModern();
        return furniture;
    }

}
