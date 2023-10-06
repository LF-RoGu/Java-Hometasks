public class Engine extends Vehicle
{
    private Manufacture l_classManufactured;
    public Engine(Manufacture l_classManufactured) {
        this.l_classManufactured = l_classManufactured;
    }

    @Override
    void showCharacteristics() {

    }
}

class CombustionEngine extends Engine
{
    public CombustionEngine(Manufacture l_classManufactured) {
        super(l_classManufactured);
    }
}

class ElectricEngine extends Engine
{
    public ElectricEngine(Manufacture l_classManufactured) {
        super(l_classManufactured);
    }
}

class HybridEngine extends Engine
{
    public HybridEngine(Manufacture l_classManufactured) {
        super(l_classManufactured);
    }
}