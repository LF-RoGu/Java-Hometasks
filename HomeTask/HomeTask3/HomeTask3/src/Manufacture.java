public class Manufacture
{
    /*
        All vehicles must have this type of information
         */
    public enum l_enumVehicle
    {
        ICEV,
        BEV,
        HybridV
    }

    public enum l_enumCombustion
    {
        No_Engine,
        cc450,
        cc500,
        cc600,
        cc850,
        cc1000
    }

    private l_enumVehicle l_enumVehicleType;
    private int l_intCarsId;
    private String l_strCarBrand;
    private String l_strCarModel;
    private int l_intCarRPM;
    private int l_intCarTorque;
    private l_enumCombustion l_enumCombustionVolume;
    private int l_intBatteryLife;   // Battery capability in years

    private int l_intCarYear;
    private String l_strCarColor;
    private int l_intCarPrice;
    private int l_intCarRegistrationNumber;
    private int l_intCarUseYears;

    public Manufacture() {
    }

    /* Constructor for ICEV */
    public Manufacture(l_enumVehicle l_enumVehicleType, int l_intCarsId, String l_strCarBrand, String l_strCarModel, int l_intCarRPM, int l_intCarTorque, l_enumCombustion l_enumCombustionVolume, int l_intCarYear, String l_strCarColor, int l_intCarPrice, int l_intCarRegistrationNumber, int l_intCarUseYears) {
        this.l_enumVehicleType = l_enumVehicleType;
        this.l_intCarsId = l_intCarsId;
        this.l_strCarBrand = l_strCarBrand;
        this.l_strCarModel = l_strCarModel;
        this.l_intCarRPM = l_intCarRPM;
        this.l_intCarTorque = l_intCarTorque;
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intCarYear = l_intCarYear;
        this.l_strCarColor = l_strCarColor;
        this.l_intCarPrice = l_intCarPrice;
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
        this.l_intCarUseYears = l_intCarUseYears;
    }

    /* Constructor for BEV */
    public Manufacture(l_enumVehicle l_enumVehicleType, int l_intCarsId, String l_strCarBrand, String l_strCarModel, int l_intCarRPM, int l_intCarTorque, int l_intBatteryLife, int l_intCarYear, String l_strCarColor, int l_intCarPrice, int l_intCarRegistrationNumber, int l_intCarUseYears) {
        this.l_enumVehicleType = l_enumVehicleType;
        this.l_intCarsId = l_intCarsId;
        this.l_strCarBrand = l_strCarBrand;
        this.l_strCarModel = l_strCarModel;
        this.l_intCarRPM = l_intCarRPM;
        this.l_intCarTorque = l_intCarTorque;
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_intCarYear = l_intCarYear;
        this.l_strCarColor = l_strCarColor;
        this.l_intCarPrice = l_intCarPrice;
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
        this.l_intCarUseYears = l_intCarUseYears;
    }
    /* Constructor for Hybrid */
    public Manufacture(l_enumVehicle l_enumVehicleType, int l_intCarsId, String l_strCarBrand, String l_strCarModel, int l_intCarRPM, int l_intCarTorque, l_enumCombustion l_enumCombustionVolume, int l_intBatteryLife, int l_intCarYear, String l_strCarColor, int l_intCarPrice, int l_intCarRegistrationNumber, int l_intCarUseYears) {
        this.l_enumVehicleType = l_enumVehicleType;
        this.l_intCarsId = l_intCarsId;
        this.l_strCarBrand = l_strCarBrand;
        this.l_strCarModel = l_strCarModel;
        this.l_intCarRPM = l_intCarRPM;
        this.l_intCarTorque = l_intCarTorque;
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_intCarYear = l_intCarYear;
        this.l_strCarColor = l_strCarColor;
        this.l_intCarPrice = l_intCarPrice;
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
        this.l_intCarUseYears = l_intCarUseYears;
    }

    public void set_enumVehicleType(l_enumVehicle l_enumVehicleType) {
        this.l_enumVehicleType = l_enumVehicleType;
    }

    public void set_intCarsId(int l_intCarsId) {
        this.l_intCarsId = l_intCarsId;
    }

    public void set_strCarBrand(String l_strCarBrand) {
        this.l_strCarBrand = l_strCarBrand;
    }

    public void set_strCarModel(String l_strCarModel) {
        this.l_strCarModel = l_strCarModel;
    }

    public void set_intCarRPM(int l_intCarRPM) {
        this.l_intCarRPM = l_intCarRPM;
    }

    public void set_intCarTorque(int l_intCarTorque) {
        this.l_intCarTorque = l_intCarTorque;
    }

    public void set_enumCombustionVolume(l_enumCombustion l_enumCombustionVolume) {
        this.l_enumCombustionVolume = l_enumCombustionVolume;
    }

    public void set_intBatteryDistance(int l_intBatteryDistance) {
        this.l_intBatteryLife = l_intBatteryDistance;
    }

    public void set_intCarYear(int l_intCarYear) {
        this.l_intCarYear = l_intCarYear;
    }

    public void set_strCarColor(String l_strCarColor) {
        this.l_strCarColor = l_strCarColor;
    }

    public void set_intCarPrice(int l_intCarPrice) {
        this.l_intCarPrice = l_intCarPrice;
    }

    public void set_intCarRegistrationNumber(int l_intCarRegistrationNumber) {
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
    }

    public void set_intCarUseYears(int l_intCarUseYears) {
        this.l_intCarUseYears = l_intCarUseYears;
    }

    public l_enumVehicle get_enumVehicleType() {
        return l_enumVehicleType;
    }

    public int get_intCarsId() {
        return l_intCarsId;
    }

    public String get_strCarBrand() {
        return l_strCarBrand;
    }

    public String get_strCarModel() {
        return l_strCarModel;
    }

    public int get_intCarRPM() {
        return l_intCarRPM;
    }

    public int get_intCarTorque() {
        return l_intCarTorque;
    }

    public l_enumCombustion get_enumCombustionVolume() {
        return l_enumCombustionVolume;
    }

    public int get_intBatteryDistance() {
        return l_intBatteryLife;
    }

    public int get_intCarYear() {
        return l_intCarYear;
    }

    public String get_strCarColor() {
        return l_strCarColor;
    }

    public int get_intCarPrice() {
        return l_intCarPrice;
    }

    public int get_intCarRegistrationNumber() {
        return l_intCarRegistrationNumber;
    }

    public int get_intCarUseYears() {
        return l_intCarUseYears;
    }
}
