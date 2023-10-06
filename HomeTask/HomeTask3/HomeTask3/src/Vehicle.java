abstract public class Vehicle
{
    abstract void showCharacteristics();

    static class ICEV extends Vehicle
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

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().toString());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());

            System.out.println("-> Vehicle Engine Volume... N.A.");
        }
    }

    static class BEV extends Vehicle
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

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().toString());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());
            /* Vehicle Battery Distance */
            System.out.println("-> Vehicle Battery Distance is... " + l_classManufacture.get_intBatteryDistance() + " km");
        }
    }

    static class HybridV extends Vehicle
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

            System.out.println("-> Vehicle ID..." + l_classManufacture.get_intCarsId());
            System.out.println("-> Vehicle Brand..." + l_classManufacture.get_strCarBrand());
            System.out.println("-> Vehicle Model..." + l_classManufacture.get_strCarModel());
            System.out.println("-> Vehicle Year..." + l_classManufacture.get_intCarYear());
            System.out.println("-> Vehicle Color..." + l_classManufacture.get_strCarColor());
            System.out.println("-> Vehicle Price ... $" + l_classManufacture.get_intCarPrice());
            System.out.println("-> Vehicle Registration Number..." + l_classManufacture.get_intCarRegistrationNumber());

            System.out.println("-> Vehicle Type Characteristics... " + l_classManufacture.get_enumVehicleType().toString());
            System.out.println("-> Vehicle RPM Characteristics... " +  l_classManufacture.get_intCarRPM());
            System.out.println("-> Vehicle Torque Characteristics... " +  l_classManufacture.get_intCarTorque());
            System.out.println("-> Vehicle Battery Distance is... " + l_classManufacture.get_intBatteryDistance() + " km");
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