public class Vehicle
{
    private Manufacture l_classManufacture;
    public Vehicle()
    {
        System.out.println("Empty constructor called");
    }

    public Vehicle(Manufacture l_classManufacture)
    {
        this.l_classManufacture = l_classManufacture;
    }

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
    private Engine l_classEngine;

    public ICEV(Manufacture l_classManufacture, Engine l_classEngine) {
        super(l_classManufacture);
        this.l_classEngine = l_classEngine;
    }
}

class BEV extends Vehicle
{
    private Engine l_classEngine;

    public BEV(Manufacture l_classManufacture, Engine l_classEngine) {
        super(l_classManufacture);
        this.l_classEngine = l_classEngine;
    }
}

class HybridV extends Vehicle
{
    private Engine l_classEngine;

    public HybridV(Manufacture l_classManufacture, Engine l_classEngine) {
        super(l_classManufacture);
        this.l_classEngine = l_classEngine;
    }
}