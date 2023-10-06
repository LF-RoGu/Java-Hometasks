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
    private CombustionEngine l_classCombustionEngine;
    private ElectricEngine l_classElectricEngine;

    public HybridEngine(Manufacture l_classManufactured, CombustionEngine l_classCombustionEngine, ElectricEngine l_classElectricEngine) {
        super(l_classManufactured);
        this.l_classCombustionEngine = l_classCombustionEngine;
        this.l_classElectricEngine = l_classElectricEngine;
    }
}