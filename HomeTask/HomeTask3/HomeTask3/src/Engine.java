public class Engine
{
    public enum l_enumCombustion
    {
        No_Engine,
        cc450,
        cc500,
        cc600,
        cc850,
        cc1000
    }
    public enum l_enumEngineType
    {
        V_Engine,
        Wankel,
        In_Line
    }
    private int l_intCarRPM;
    private int l_intCarTorque;
    Manufacture l_classManufacture;

    public Engine(int l_intCarRPM, int l_intCarTorque, Manufacture l_classManufacture) {
        this.l_intCarRPM = l_intCarRPM;
        this.l_intCarTorque = l_intCarTorque;
        this.l_classManufacture = l_classManufacture;

        setValuesEngine(this.l_intCarRPM, this.l_intCarTorque, this.l_classManufacture);
    }

    private void setValuesEngine(int l_intCarRPM, int l_intCarTorque, Manufacture l_classManufacture)
    {
        l_classManufacture.set_intCarRPM(l_intCarRPM);
        l_classManufacture.set_intCarTorque(l_intCarTorque);
    }
}

class CombustionEngine extends Engine
{
    private l_enumCombustion l_enumCombustionVolume;
    private int l_intCylinders;
    private l_enumEngineType l_strEngineType; //Wankel, V, In-Line

    public CombustionEngine(int l_intCarRPM, int l_intCarTorque, l_enumCombustion l_enumCombustionVolume, int l_intCylinders, l_enumEngineType l_strEngineType, Manufacture l_classManufacture) {
        super(l_intCarRPM, l_intCarTorque, l_classManufacture);
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intCylinders = l_intCylinders;
        this.l_strEngineType = l_strEngineType;

        setValuesCombustionEngine(this.l_enumCombustionVolume, this.l_intCylinders, this.l_strEngineType, l_classManufacture);
    }

    private void setValuesCombustionEngine(l_enumCombustion l_enumCombustionVolume, int l_intCylinders, l_enumEngineType l_strEngineType, Manufacture l_classManufacture)
    {
        l_classManufacture.set_enumCombustionVolume(l_enumCombustionVolume);
        l_classManufacture.set_intCylinders(l_intCylinders);
        l_classManufacture.set_enumEngineType(l_strEngineType);
    }
}

class ElectricEngine extends Engine
{
    private int l_intBatteryLife;   // Battery capability in years
    private boolean l_boolGenerator;
    private boolean l_boolConverter;
    Manufacture l_classManufacture;

    public ElectricEngine(int l_intCarRPM, int l_intCarTorque, int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter, Manufacture l_classManufacture) {
        super(l_intCarRPM, l_intCarTorque, l_classManufacture);
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_boolGenerator = l_boolGenerator;
        this.l_boolConverter = l_boolConverter;

        setValuesElectricEngine(this.l_intBatteryLife, this.l_boolGenerator, this.l_boolConverter, l_classManufacture);
    }

    private void setValuesElectricEngine(int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter, Manufacture l_classManufacture)
    {
        l_classManufacture.set_intBatteryLife(l_intBatteryLife);
        l_classManufacture.set_boolGenerator(l_boolGenerator);
        l_classManufacture.set_boolConverter(l_boolConverter);
    }
}

class HybridEngine extends Engine
{
    private l_enumCombustion l_enumCombustionVolume;
    private int l_intCylinders;
    private l_enumEngineType l_enumEngineType; //Wankel, V, In-Line
    private int l_intBatteryLife;   // Battery capability in years
    private boolean l_boolGenerator;
    private boolean l_boolConverter;

    public HybridEngine(int l_intCarRPM, int l_intCarTorque, l_enumCombustion l_enumCombustionVolume, int l_intCylinders, Engine.l_enumEngineType l_enumEngineType, int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter, Manufacture l_classManufacture) {
        super(l_intCarRPM, l_intCarTorque, l_classManufacture);
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intCylinders = l_intCylinders;
        this.l_enumEngineType = l_enumEngineType;
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_boolGenerator = l_boolGenerator;
        this.l_boolConverter = l_boolConverter;

        setValuesHybridEngine(this.l_enumCombustionVolume, this.l_intCylinders, this.l_enumEngineType, this.l_intBatteryLife, this.l_boolGenerator, this.l_boolConverter, l_classManufacture);
    }

    private void setValuesHybridEngine(l_enumCombustion l_enumCombustionVolume, int l_intCylinders, l_enumEngineType l_enumEngineType, int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter, Manufacture l_classManufacture)
    {
        l_classManufacture.set_enumCombustionVolume(l_enumCombustionVolume);
        l_classManufacture.set_intCylinders(l_intCylinders);
        l_classManufacture.set_enumEngineType(l_enumEngineType);

        l_classManufacture.set_intBatteryLife(l_intBatteryLife);
        l_classManufacture.set_boolGenerator(l_boolGenerator);
        l_classManufacture.set_boolConverter(l_boolConverter);
    }
}