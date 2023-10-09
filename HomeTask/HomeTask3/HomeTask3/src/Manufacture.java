public class Manufacture
{
    /*
    All vehicles must have this type of information
    */

    private Vehicle.l_enumVehicle l_enumVehicleType;
    private int l_intCarsId;
    private String l_strCarBrand;
    private String l_strCarModel;
    private int l_intCarRPM;
    private int l_intCarTorque;
    private int l_intCylinders;
    private Engine.l_enumEngineType l_enumEngineType; //Wankel, V, In-Line
    private Engine.l_enumCombustion l_enumCombustionVolume;
    private int l_intBatteryLife;   // Battery capability in years

    private int l_intCarYear;
    private String l_strCarColor;
    private int l_intCarPrice;
    private int l_intCarRegistrationNumber;
    private int l_intCarUseYears;
    private boolean l_boolGenerator;
    private boolean l_boolConverter;

    private boolean l_boolSunRoof;
    private int l_intNumDoors;
    private int l_intNumPassengers;

    public Manufacture() {
    }

    public Manufacture(int l_intCarsId, String l_strCarBrand, String l_strCarModel, int l_intCarYear, String l_strCarColor, int l_intCarPrice, int l_intCarRegistrationNumber, int l_intCarUseYears) {
        this.l_intCarsId = l_intCarsId;
        this.l_strCarBrand = l_strCarBrand;
        this.l_strCarModel = l_strCarModel;
        this.l_intCarYear = l_intCarYear;
        this.l_strCarColor = l_strCarColor;
        this.l_intCarPrice = l_intCarPrice;
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
        this.l_intCarUseYears = l_intCarUseYears;
    }

    public void set_enumVehicleType(Vehicle.l_enumVehicle l_enumVehicleType) {
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

    public void set_intCylinders(int l_intCylinders) {
        this.l_intCylinders = l_intCylinders;
    }

    public void set_enumEngineType(Engine.l_enumEngineType l_enumEngineType) {
        this.l_enumEngineType = l_enumEngineType;
    }

    public void set_enumCombustionVolume(Engine.l_enumCombustion l_enumCombustionVolume) {
        this.l_enumCombustionVolume = l_enumCombustionVolume;
    }

    public void set_intBatteryLife(int l_intBatteryLife) {
        this.l_intBatteryLife = l_intBatteryLife;
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

    public void set_boolGenerator(boolean l_boolGenerator) {
        this.l_boolGenerator = l_boolGenerator;
    }

    public void set_boolConverter(boolean l_boolConverter) {
        this.l_boolConverter = l_boolConverter;
    }

    public void set_boolSunRoof(boolean l_boolSunRoof) {
        this.l_boolSunRoof = l_boolSunRoof;
    }

    public void set_intNumDoors(int l_intNumDoors) {
        this.l_intNumDoors = l_intNumDoors;
    }

    public void set_intNumPassengers(int l_intNumPassengers) {
        this.l_intNumPassengers = l_intNumPassengers;
    }

    public Vehicle.l_enumVehicle get_enumVehicleType() {
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

    public int get_intCylinders() {
        return l_intCylinders;
    }

    public Engine.l_enumEngineType get_enumEngineType() {
        return l_enumEngineType;
    }

    public Engine.l_enumCombustion get_enumCombustionVolume() {
        return l_enumCombustionVolume;
    }

    public int get_intBatteryLife() {
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

    public boolean get_boolGenerator() {
        return l_boolGenerator;
    }

    public boolean get_boolConverter() {
        return l_boolConverter;
    }

    public boolean get_boolSunRoof() {
        return l_boolSunRoof;
    }

    public int get_intNumDoors() {
        return l_intNumDoors;
    }

    public int get_intNumPassengers() {
        return l_intNumPassengers;
    }
}
