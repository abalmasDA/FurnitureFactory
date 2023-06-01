public class FurnitureFactoryModern implements FurnitureFactory {

    @Override
    public Furniture createArmchair() {
        Furniture armchair = new ArmchairModern();
        return armchair;
    }

    @Override
    public Furniture createSofa() {
        Furniture sofa = new SofaModern();
        return sofa;
    }

    @Override
    public Furniture createTable() {
        Furniture table = new TableModern();
        return table;
    }

}
