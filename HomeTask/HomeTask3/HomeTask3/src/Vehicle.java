abstract public class Vehicle
{
    public void ignitionKeyOn()
    {
        System.out.println("Ignition Key On");
    }
    public void ignitionKeyOf()
    {
        System.out.println("Ignition Key Off");
    }
    abstract void showCharacteristics();
}

class ICEV extends Vehicle
{
    private Manufacture l_classManufacture;
    private CombustionEngine l_classCombustionEngine;

    public ICEV(Manufacture l_classManufacture, CombustionEngine l_classCombustionEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classCombustionEngine = l_classCombustionEngine;
    }

    @Override
    void showCharacteristics()
    {
        System.out.println("--------------------------------------------");
        System.out.println("-> Vehicle Type Characteristics... ICEV");
        System.out.println("-> Vehicle RPM Characteristics... " +  l_classCombustionEngine.get_intEngineRPM());
        System.out.println("-> Vehicle Torque Characteristics... " +  l_classCombustionEngine.get_intEngineTorque());
        System.out.println("-> Vehicle Engine Characteristics... " +  l_classCombustionEngine.get_floatEngineSize() + " cm");

        switch (l_classCombustionEngine.get_enumCombustionVolType())
        {
            case cc450 ->
            {
                System.out.println("-> Vehicle Engine Volume... 450cc");
            }
            case cc500 ->
            {
                System.out.println("-> Vehicle Engine Volume... 500cc");
            }
            case cc600 ->
            {
                System.out.println("-> Vehicle Engine Volume... 600cc");
            }
            case cc850 ->
            {
                System.out.println("-> Vehicle Engine Volume... 850cc");
            }
            case cc1000 ->
            {
                System.out.println("-> Vehicle Engine Volume... 1000cc");
            }
            default ->
            {
                System.out.println("-> Vehicle Engine Volume... N.A.");
            }
        }
    }
}

class BEV extends Vehicle
{
    private Manufacture l_classManufacture;
    private ElectricEngine l_classElectricEngine;

    public BEV(Manufacture l_classManufacture, ElectricEngine l_classElectricEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classElectricEngine = l_classElectricEngine;
    }

    @Override
    void showCharacteristics()
    {
        System.out.println("--------------------------------------------");
        System.out.println("-> Vehicle Type Characteristics... BEV");
        System.out.println("-> Vehicle RPM Characteristics... " +  l_classElectricEngine.get_intEngineRPM());
        System.out.println("-> Vehicle Torque Characteristics... " +  l_classElectricEngine.get_intEngineTorque());
        System.out.println("-> Vehicle Engine Characteristics... " +  l_classElectricEngine.get_floatEngineSize() + " cm");
        /* Vehicle Battery Distance */
        System.out.println("-> Vehicle Battery Distance is... " + l_classElectricEngine.get_intBatteryDistance() + " km");
    }
}

class HybridV extends Vehicle
{
    private Manufacture l_classManufacture;
    private HybridEngine l_classHybridEngine;

    public HybridV(Manufacture l_classManufacture, HybridEngine l_classHybridEngine) {
        this.l_classManufacture = l_classManufacture;
        this.l_classHybridEngine = l_classHybridEngine;
    }

    @Override
    void showCharacteristics()
    {
        System.out.println("--------------------------------------------");
        System.out.println("-> Vehicle Type Characteristics... HybridV");
        System.out.println("-> Vehicle RPM Characteristics... " +  l_classHybridEngine.get_intEngineRPM());
        System.out.println("-> Vehicle Torque Characteristics... " +  l_classHybridEngine.get_intEngineTorque());
        System.out.println("-> Vehicle Engine Characteristics... " +  l_classHybridEngine.get_floatEngineSize() + " cm");
        System.out.println("-> Vehicle Battery Distance is... " + l_classHybridEngine.get_classElectricEngine().get_intBatteryDistance() + " km");
        switch (l_classHybridEngine.get_classCombustionEngine().get_enumCombustionVolType())
        {
            case cc450 ->
            {
                System.out.println("-> Vehicle Engine Volume... 450cc");
            }
            case cc500 ->
            {
                System.out.println("-> Vehicle Engine Volume... 500cc");
            }
            case cc600 ->
            {
                System.out.println("-> Vehicle Engine Volume... 600cc");
            }
            case cc850 ->
            {
                System.out.println("-> Vehicle Engine Volume... 850cc");
            }
            case cc1000 ->
            {
                System.out.println("-> Vehicle Engine Volume... 1000cc");
            }
            default ->
            {
                System.out.println("-> Vehicle Engine Volume... N.A.");
            }
        }

    }
}