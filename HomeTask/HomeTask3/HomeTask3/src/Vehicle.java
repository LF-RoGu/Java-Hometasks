public class Vehicle
{
    public void ignitionKeyOn()
    {
        System.out.println("Ignition Key On");
    }
    public void ignitionKeyOf()
    {
        System.out.println("Ignition Key Off");
    }
    public void showCharacteristics()
    {

    }
}

class ICEV extends Vehicle
{
    private Manufacture l_classManufacture;
    private Engine l_classEngine;

    public ICEV(Manufacture l_classManufacture, Engine l_classEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classEngine = l_classEngine;
    }
}

class BEV extends Vehicle
{
    private Manufacture l_classManufacture;
    private Engine l_classEngine;

    public BEV(Manufacture l_classManufacture, Engine l_classEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classEngine = l_classEngine;
    }
}

class HybridV extends Vehicle
{
    private Manufacture l_classManufacture;
    private Engine l_classEngine;

    public HybridV(Manufacture l_classManufacture, Engine l_classEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classEngine = l_classEngine;
    }
}