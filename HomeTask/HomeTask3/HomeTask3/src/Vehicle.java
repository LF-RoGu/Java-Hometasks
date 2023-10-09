abstract public class Vehicle
{
    public enum l_enumVehicle
    {
        ICEV,
        BEV,
        HybridV
    }
    private boolean l_boolSunRoof;
    private int l_intNumDoors;
    private int l_intNumPassengers;
    private l_enumVehicle l_enumVehicleType;

    public Vehicle(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, l_enumVehicle l_enumVehicleType, Manufacture l_classManufacture) {
        this.l_boolSunRoof = l_boolSunRoof;
        this.l_intNumDoors = l_intNumDoors;
        this.l_intNumPassengers = l_intNumPassengers;
        this.l_enumVehicleType = l_enumVehicleType;

        setValuesVehicle(this.l_boolSunRoof, this.l_intNumDoors, this.l_intNumPassengers, this.l_enumVehicleType, l_classManufacture);
    }

    private void setValuesVehicle(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, l_enumVehicle l_enumVehicleType, Manufacture l_classManufacture)
    {
        l_classManufacture.set_boolSunRoof(l_boolSunRoof);
        l_classManufacture.set_intNumDoors(l_intNumDoors);
        l_classManufacture.set_intNumPassengers(l_intNumPassengers);
        l_classManufacture.set_enumVehicleType(l_enumVehicleType);
    }

    abstract void showCharacteristics(Manufacture l_classManufacture);

    static class ICEV extends Vehicle
    {
        private CombustionEngine l_classCombustionEngine;

        public ICEV(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, l_enumVehicle l_enumVehicleType, CombustionEngine l_classCombustionEngine, Manufacture l_classManufacture) {
            super(l_boolSunRoof, l_intNumDoors, l_intNumPassengers, l_enumVehicleType, l_classManufacture);
            this.l_classCombustionEngine = l_classCombustionEngine;
        }

        @Override
        void showCharacteristics(Manufacture l_classManufacture)
        {
            System.out.println("--------------------------------------------");

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());
            System.out.println("-> Vehicle has " +  l_classManufacture.get_intNumDoors() + " Doors");
            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
            System.out.println("-> Vehicle can carry...  " +  l_classManufacture.get_intNumPassengers() + " Passengers");

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().name());
            System.out.println("-> Vehicle has " +  l_classManufacture.get_intCylinders() + " Cylinders");
            System.out.println("-> Vehicle Engine Type...  " +  l_classManufacture.get_enumEngineType().name());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());

            System.out.println("-> Vehicle Engine Volume... N.A.");
        }
    }

    static class BEV extends Vehicle
    {

        private ElectricEngine l_classElectricEngine;

        public BEV(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, l_enumVehicle l_enumVehicleType, ElectricEngine l_classElectricEngine, Manufacture l_classManufacture) {
            super(l_boolSunRoof, l_intNumDoors, l_intNumPassengers, l_enumVehicleType, l_classManufacture);
            this.l_classElectricEngine = l_classElectricEngine;
        }

        @Override
        void showCharacteristics(Manufacture l_classManufacture)
        {
            System.out.println("--------------------------------------------");

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());
            System.out.println("-> Vehicle has " +  l_classManufacture.get_intNumDoors() + " Doors");
            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
            System.out.println("-> Vehicle can carry...  " +  l_classManufacture.get_intNumPassengers() + " Passengers");

            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolGenerator() ? ("has"):("does not have")) + " Generator" );
            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolConverter() ? ("has"):("does not have")) + " Converter" );

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().name());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());
            /* Vehicle Battery Distance */
            System.out.println("-> Vehicle Battery Distance is... " + l_classManufacture.get_intBatteryLife() + " km");
        }
    }

    static class HybridV extends Vehicle
    {
        private HybridEngine l_classHybridEngine;

        public HybridV(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, l_enumVehicle l_enumVehicleType, HybridEngine l_classHybridEngine, Manufacture l_classManufacture) {
            super(l_boolSunRoof, l_intNumDoors, l_intNumPassengers, l_enumVehicleType, l_classManufacture);
            this.l_classHybridEngine = l_classHybridEngine;
        }

        @Override
        void showCharacteristics(Manufacture l_classManufacture)
        {
            System.out.println("--------------------------------------------");

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());
            System.out.println("-> Vehicle has " +  l_classManufacture.get_intNumDoors() + " Doors");
            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
            System.out.println("-> Vehicle can carry...  " +  l_classManufacture.get_intNumPassengers() + " Passengers");

            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolGenerator() ? ("has"):("does not have")) + " Generator" );
            System.out.println("-> Vehicle " +  (l_classManufacture.get_boolConverter() ? ("has"):("does not have")) + " Converter" );

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().name());
            System.out.println("-> Vehicle has " +  l_classManufacture.get_intCylinders() + " Cylinders");
            System.out.println("-> Vehicle Engine Type...  " +  l_classManufacture.get_enumEngineType().name());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());
            System.out.println("-> Vehicle Battery Distance is... " + l_classManufacture.get_intBatteryLife() + " km");
            switch (l_classManufacture.get_enumCombustionVolume())
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
}