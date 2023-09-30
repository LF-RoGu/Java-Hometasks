public class Engine extends Vehicle
{
    private int l_intEngineRPM; // Revolutions per Minute
    private int l_intEngineTorque;  // Force measured in Newtons
    private float l_floatEngineSize; // Centimeters
    /* Create empty default constructor */
    public Engine()
    {
        System.out.println("Empty constructor called");
    }

    public Engine(int l_intEngineRPM, int l_intEngineTorque, float l_floatEngineSize) {
        this.l_intEngineRPM = l_intEngineRPM;
        this.l_intEngineTorque = l_intEngineTorque;
        this.l_floatEngineSize = l_floatEngineSize;
    }
}

class CombustionEngine extends Engine
{
    public enum l_enumCombustionVol
    {
        No_Engine,
        cc450,
        cc500,
        cc600,
        cc850,
        cc1000
    }
    private l_enumCombustionVol l_enumCombustionVolType;

    public CombustionEngine()
    {
        System.out.println("Empty constructor called");
    }

    public CombustionEngine(int l_intEngineRPM, int l_intEngineTorque, float l_floatEngineSize, l_enumCombustionVol l_enumCombustionVolType) {
        super(l_intEngineRPM, l_intEngineTorque, l_floatEngineSize);
        this.l_enumCombustionVolType = l_enumCombustionVolType;
    }
}

class ElectricEngine extends Engine
{
    private int l_intBatteryDistance;   // Battery capability in kilometers

    public ElectricEngine()
    {
        System.out.println("Empty constructor called");
    }

    public ElectricEngine(int l_intEngineRPM, int l_intEngineTorque, float l_floatEngineSize, int l_intBatteryDistance) {
        super(l_intEngineRPM, l_intEngineTorque, l_floatEngineSize);
        this.l_intBatteryDistance = l_intBatteryDistance;
    }
}

class HybridEngine extends Engine
{
    private CombustionEngine l_classCombustionEngine;
    private ElectricEngine l_classElectricEngine;

    public HybridEngine()
    {
        System.out.println("Empty constructor called");
    }

    public HybridEngine(CombustionEngine l_classCombustionEngine, ElectricEngine l_classElectricEngine) {
        this.l_classCombustionEngine = l_classCombustionEngine;
        this.l_classElectricEngine = l_classElectricEngine;
    }
}