public class FurnitureFactoryArtDeco implements FurnitureFactory {

    @Override
    public Furniture createArmchair() {
        Furniture armchair = new ArmchairArtDeco();
        return armchair;
    }

    @Override
    public Furniture createSofa() {
        Furniture sofa = new SofaArtDeco();
        return sofa;
    }

    @Override
    public Furniture createTable() {
        Furniture table = new TableArtDeco();
        return table;
    }

}
