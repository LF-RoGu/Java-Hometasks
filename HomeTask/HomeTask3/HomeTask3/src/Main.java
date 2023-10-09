// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* Import Scanner lib so work can be done in IntelliJ */
import java.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main
{
    public enum l_enumFileCreation
    {
        CREATED,
        EXISTING,
        ERROR
    }
    public static void main(String[] args) throws IOException {
        enum l_enumVehicles
        {
            ICEV,
            BEV,
            HybridV
        }
        /* Add more VEHICLE_# if more vehicles are needed */
        enum l_enumVehiclesAdded
        {
            VEHICLE_1,
            VEHICLE_2
        }

        /* Lenght of the enum for vehicle types, if more vehicles are to be added to the array */
        int l_intNumberOfVehiclesType = l_enumVehicles.values().length;
        /* Bi-Dimensional array, where:
        * l_intNumberOfVehiclesType -> Amount of vehicle types
        * l_intNumberOfVehiclesToAdd -> Amount of vehicles of each variant to add
        */
        Vehicle[][] l_subClassVehicle = new Vehicle[l_intNumberOfVehiclesType][l_enumVehiclesAdded.values().length];

        /*
        Create a folder to send the .txt files
         */
        l_enumFileCreation l_enumFolderCreationOption = FolderCreation();
        /* Counter to keep track of existing files */
        int l_intExistingFileCounter = 0;

        /*
        Example for ICEV subclass
        Manufacture -> Attributes for the vehicle.
        CombustionEngine -> Attributes received by Manufactured, this is specific for the combustion engine.
         */
        Manufacture l_classManufactureICEV_rio = new Manufacture(203040, "Kia", "Rio", 2021, "Red", 16750, 807060, 2);
        CombustionEngine l_subClassCombustionEngine = new CombustionEngine(4000, 115, Engine.l_enumCombustion.cc450, 4, Engine.l_enumEngineType.V_Engine, l_classManufactureICEV_rio);
        l_subClassVehicle[l_enumVehicles.ICEV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()] = new Vehicle.ICEV(true, 4,5, Vehicle.l_enumVehicle.ICEV, l_subClassCombustionEngine, l_classManufactureICEV_rio);
        l_subClassVehicle[l_enumVehicles.ICEV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()].showCharacteristics(l_classManufactureICEV_rio);

        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classManufactureICEV_rio, l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));


        /*
        Example for ICEV subclass
        Manufacture -> Attributes for the second vehicle.
        CombustionEngine -> Attributes received by Manufactured, this is specific for the combustion engine.
         */
        Manufacture l_classManufactureICEV_rioHatchback = new Manufacture(213141, "Kia", "Rio Hatchback", 2021, "Red", 16750, 817161, 2);
        CombustionEngine l_subClassCombustionEngineHatchback = new CombustionEngine(4000, 115, Engine.l_enumCombustion.cc450, 4, Engine.l_enumEngineType.V_Engine, l_classManufactureICEV_rioHatchback);

        l_subClassVehicle[l_enumVehicles.ICEV.ordinal()][l_enumVehiclesAdded.VEHICLE_2.ordinal()] = new Vehicle.ICEV(true, 4,5, Vehicle.l_enumVehicle.ICEV, l_subClassCombustionEngineHatchback, l_classManufactureICEV_rioHatchback);
        l_subClassVehicle[l_enumVehicles.ICEV.ordinal()][l_enumVehiclesAdded.VEHICLE_2.ordinal()].showCharacteristics(l_classManufactureICEV_rioHatchback);

        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classManufactureICEV_rioHatchback, l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));
        /*
        Example for BEV subclass
        Manufacture -> Attributes for the vehicle.
        ElectricEngine -> Attributes received by Manufactured, this is specific for the electricEngine engine.
         */
        Manufacture l_classManufactureBEV_i3 = new Manufacture(102030, "BMW", "i3", 2022, "White", 45445, 908070, 1);
        ElectricEngine l_subClassElectricEngine = new ElectricEngine(4775, 250, 215, true, true, l_classManufactureBEV_i3);

        l_subClassVehicle[l_enumVehicles.BEV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()] = new Vehicle.BEV(true, 4, 5, Vehicle.l_enumVehicle.BEV, l_subClassElectricEngine, l_classManufactureBEV_i3);
        l_subClassVehicle[l_enumVehicles.BEV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()].showCharacteristics(l_classManufactureBEV_i3);

        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classManufactureBEV_i3, l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));

        /*
        Example for HybridV subclass
        Manufacture -> Attributes for the vehicle.
        HybridEngine -> Attributes received by Manufactured, this is specific for the Hybrid engine.
         */
        Manufacture l_classManufactureHybridV_530e = new Manufacture(304050, "BMW", "530e", 2023, "Grey", 40430, 706050, 1);
        HybridEngine l_subClassHybridEngine = new HybridEngine(4775, 250, Engine.l_enumCombustion.cc850, 6, Engine.l_enumEngineType.Wankel, 105, true, true, l_classManufactureHybridV_530e);
        l_subClassVehicle[l_enumVehicles.HybridV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()] = new Vehicle.HybridV(false, 4, 5, Vehicle.l_enumVehicle.HybridV, l_subClassHybridEngine, l_classManufactureHybridV_530e);
        l_subClassVehicle[l_enumVehicles.HybridV.ordinal()][l_enumVehiclesAdded.VEHICLE_1.ordinal()].showCharacteristics(l_classManufactureHybridV_530e);

        /*
        Logic for creating the files into folder, in this logic a counter is reset before entering (this for each code iteration)
        It keeps going unless we get a successful file creation
         */
        l_intExistingFileCounter = 0;
        do
        {
            l_intExistingFileCounter++;
            l_enumFolderCreationOption = CreateFile(l_classManufactureHybridV_530e, l_intExistingFileCounter);
        }while((l_enumFolderCreationOption != l_enumFileCreation.CREATED));

    }

    static l_enumFileCreation FolderCreation()
    {
        /* Variable for return possible values */
        l_enumFileCreation l_varReturnValue = l_enumFileCreation.ERROR;
        /* getProperty -> is used to obtain the current directory that the project is being executed */
        String l_strCurrentDir = System.getProperty("user.dir");
        /* Folder name to separate all the generated '.txt' files */
        String l_strFolderName = "GenTxt";
        /* Full new path */
        String l_strFolderPath = l_strCurrentDir + File.separator + l_strFolderName;
        /* Object for new folder creation */
        File l_fldrNewFolder = new File(l_strFolderPath);

        if (!l_fldrNewFolder.exists()) {
            if (l_fldrNewFolder.mkdirs()) {
                l_varReturnValue = l_enumFileCreation.CREATED;
            } else {
                l_varReturnValue = l_enumFileCreation.ERROR;
            }

        } else {
            /* Folder already existing */
            l_varReturnValue = l_enumFileCreation.EXISTING;
        }
        return l_varReturnValue;
    }

    static l_enumFileCreation CreateFile(Manufacture varManufacture, int varFileCounter) throws IOException
    {
        /* Variable for return possible values */
        l_enumFileCreation l_varReturnValue = l_enumFileCreation.ERROR;
        /* getProperty -> is used to obtain the current directory that the project is being executed */
        String l_strCurrentDir = System.getProperty("user.dir");
        /* Folder name to separate all the generated '.txt' files */
        String l_strFolderName = "GenTxt";
        /* File type extension */
        String l_strSufix = ".txt";
        /* Full new path */
        String l_strFilePath = l_strCurrentDir + File.separator + l_strFolderName + File.separator + varManufacture.get_enumVehicleType().name() + Integer.toString(varFileCounter);


        File file2createBrand = new File(l_strFilePath + l_strSufix);
        if (file2createBrand.createNewFile())
        {
            System.out.println("File created as... " + file2createBrand.getName());
            try
            {
                /*
                Open file already created to write expected information
                 */
                FileWriter file2writeBrand = new FileWriter(l_strFilePath + l_strSufix);
                /* Create object buffered so multiple information can be stored */
                BufferedWriter info = new BufferedWriter(file2writeBrand);
                switch (varManufacture.get_enumVehicleType())
                {
                    case ICEV ->
                    {
                        /* Add info to buffer and write into file */
                        info.write("-------------------------------------");
                        info.newLine();
                        info.write("-> Vehicle Type... " + varManufacture.get_enumVehicleType().name());
                        info.newLine();
                        info.write("-> Vehicle has " +  Integer.toString(varManufacture.get_intCylinders()) + " Cylinders");
                        info.newLine();
                        info.write("-> Vehicle Engine Type...  " +  varManufacture.get_enumEngineType().name());
                        info.newLine();
                        info.write("-> Vehicle ID... " + Integer.toString(varManufacture.get_intCarsId()));
                        info.newLine();
                        info.write("-> Vehicle Brand... " + varManufacture.get_strCarBrand());
                        info.newLine();
                        info.write("-> Vehicle Model... " + varManufacture.get_strCarModel());
                        info.newLine();
                        info.write("-> Vehicle RPM... " + Integer.toString(varManufacture.get_intCarRPM()));
                        info.newLine();
                        info.write("-> Vehicle Torque... " + Integer.toString(varManufacture.get_intCarTorque()));
                        info.newLine();
                        info.write("-> Vehicle Combustion Volume... " + varManufacture.get_enumCombustionVolume().name());
                        info.newLine();
                        info.write("-> Vehicle Year... " + Integer.toString(varManufacture.get_intCarYear()));
                        info.newLine();
                        info.write("-> Vehicle Color... " + varManufacture.get_strCarColor());
                        info.newLine();
                        info.write("-> Vehicle Price... $" + Integer.toString(varManufacture.get_intCarPrice()));
                        info.newLine();
                        info.write("-> Vehicle Registration Number... " + Integer.toString(varManufacture.get_intCarRegistrationNumber()));
                        info.newLine();
                        info.write("-> Vehicle used years... " + Integer.toString(varManufacture.get_intCarUseYears()));
                        info.newLine();
                        info.write("-> Vehicle has " +  Integer.toString(varManufacture.get_intNumDoors()) + " Doors");
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
                        info.newLine();
                        info.write("-> Vehicle can carry...  " +  Integer.toString(varManufacture.get_intNumPassengers()) + " Passengers");
                        info.newLine();
                    }
                    case BEV ->
                    {
                        /* Add info to buffer and write into file */
                        info.write("-------------------------------------");
                        info.newLine();
                        info.write("-> Vehicle Type... " + varManufacture.get_enumVehicleType().name());
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolGenerator() ? ("has"):("does not have")) + " Generator" );
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolConverter() ? ("has"):("does not have")) + " Converter" );
                        info.newLine();
                        info.write("-> Vehicle ID... " + Integer.toString(varManufacture.get_intCarsId()));
                        info.newLine();
                        info.write("-> Vehicle Brand... " + varManufacture.get_strCarBrand());
                        info.newLine();
                        info.write("-> Vehicle Model... " + varManufacture.get_strCarModel());
                        info.newLine();
                        info.write("-> Vehicle RPM... " + Integer.toString(varManufacture.get_intCarRPM()));
                        info.newLine();
                        info.write("-> Vehicle Torque... " + Integer.toString(varManufacture.get_intCarTorque()));
                        info.newLine();
                        info.write("-> Vehicle Battery Distance... " + varManufacture.get_intBatteryLife() + " km");
                        info.newLine();
                        info.write("-> Vehicle Year... " + Integer.toString(varManufacture.get_intCarYear()));
                        info.newLine();
                        info.write("-> Vehicle Color... " + varManufacture.get_strCarColor());
                        info.newLine();
                        info.write("-> Vehicle Price... $" + Integer.toString(varManufacture.get_intCarPrice()));
                        info.newLine();
                        info.write("-> Vehicle Registration Number... " + Integer.toString(varManufacture.get_intCarRegistrationNumber()));
                        info.newLine();
                        info.write("-> Vehicle used years... " + Integer.toString(varManufacture.get_intCarUseYears()));
                        info.newLine();
                        info.write("-> Vehicle has " +  Integer.toString(varManufacture.get_intNumDoors()) + " Doors");
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
                        info.newLine();
                        info.write("-> Vehicle can carry...  " +  Integer.toString(varManufacture.get_intNumPassengers()) + " Passengers");
                        info.newLine();
                    }
                    case HybridV ->
                    {
                        /* Add info to buffer and write into file */
                        info.write("-------------------------------------");
                        info.newLine();
                        info.write("-> Vehicle Type... " + varManufacture.get_enumVehicleType().name());
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolGenerator() ? ("has"):("does not have")) + " Generator" );
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolConverter() ? ("has"):("does not have")) + " Converter" );
                        info.newLine();
                        info.write("-> Vehicle has " +  Integer.toString(varManufacture.get_intCylinders()) + " Cylinders");
                        info.newLine();
                        info.write("-> Vehicle Engine Type...  " +  varManufacture.get_enumEngineType().name());
                        info.newLine();
                        info.write("-> Vehicle ID... " + Integer.toString(varManufacture.get_intCarsId()));
                        info.newLine();
                        info.write("-> Vehicle Brand... " + varManufacture.get_strCarBrand());
                        info.newLine();
                        info.write("-> Vehicle Model... " + varManufacture.get_strCarModel());
                        info.newLine();
                        info.write("-> Vehicle RPM... " + Integer.toString(varManufacture.get_intCarRPM()));
                        info.newLine();
                        info.write("-> Vehicle Torque... " + Integer.toString(varManufacture.get_intCarTorque()));
                        info.newLine();
                        info.write("-> Vehicle Combustion Volume... " + varManufacture.get_enumCombustionVolume().name());
                        info.newLine();
                        info.write("-> Vehicle Battery Distance... " + varManufacture.get_intBatteryLife() + " km");
                        info.newLine();
                        info.write("-> Vehicle Year... " + Integer.toString(varManufacture.get_intCarYear()));
                        info.newLine();
                        info.write("-> Vehicle Color... " + varManufacture.get_strCarColor());
                        info.newLine();
                        info.write("-> Vehicle Price... $" + Integer.toString(varManufacture.get_intCarPrice()));
                        info.newLine();
                        info.write("-> Vehicle Registration Number... " + Integer.toString(varManufacture.get_intCarRegistrationNumber()));
                        info.newLine();
                        info.write("-> Vehicle used years... " + Integer.toString(varManufacture.get_intCarUseYears()));
                        info.newLine();
                        info.write("-> Vehicle has " +  Integer.toString(varManufacture.get_intNumDoors()) + " Doors");
                        info.newLine();
                        info.write("-> Vehicle " +  (varManufacture.get_boolSunRoof() ? ("has"):("does not have")) + " SunRoof" );
                        info.newLine();
                        info.write("-> Vehicle can carry...  " +  Integer.toString(varManufacture.get_intNumPassengers()) + " Passengers");
                        info.newLine();
                    }
                    default ->
                    {
                        System.out.println("An error ocurred");
                        l_varReturnValue = l_enumFileCreation.ERROR;
                    }
                }
                /* Send info to .txt file and close file */
                info.close();
                System.out.println("Successfully write in file " + file2createBrand.getName());
                l_varReturnValue = l_enumFileCreation.CREATED;
            }catch (IOException e)
            {
                System.out.println("An error ocurred");
                l_varReturnValue = l_enumFileCreation.ERROR;
            }
        } else
        {
            System.out.println("File already existed");
            l_varReturnValue = l_enumFileCreation.EXISTING;
        }
        return l_varReturnValue;
    }
}