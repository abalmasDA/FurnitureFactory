public class FurnitureFactoryVictorian implements FurnitureFactory {

    @Override
    public Furniture createArmchair() {
        Furniture armchair = new ArmchairVictorian();
        return armchair;
    }

    @Override
    public Furniture createSofa() {
        Furniture sofa = new SofaVictorian();
        return sofa;
    }

    @Override
    public Furniture createTable() {
        Furniture table = new TableVictorian();
        return table;
    }

}
