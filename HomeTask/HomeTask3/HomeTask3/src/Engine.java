public class Engine extends Vehicle
{
    private enum l_enumCombustionVol
    {
        No_Engine,
        cc450,
        cc500,
        cc600,
        cc850,
        cc1000

    }
    private String l_strCombustionEngine;
    private String l_strElectricEngine;
    private String l_strHybridEngine;
    private l_enumCombustionVol l_enumCombustionVolType;

    /* Create empty default constructor */
    public Engine()
    {
        System.out.println("Empty constructor called");
    }

    public Engine(l_enumVehicle l_enumVehicleType, String l_strCombustionEngine, String l_strElectricEngine, String l_strHybridEngine, l_enumCombustionVol l_enumCombustionVolType) {
        super(l_enumVehicleType);
        this.l_strCombustionEngine = l_strCombustionEngine;
        this.l_strElectricEngine = l_strElectricEngine;
        this.l_strHybridEngine = l_strHybridEngine;
        this.l_enumCombustionVolType = l_enumCombustionVolType;
    }
}
