// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/* Import Scanner lib so work can be done in IntelliJ */
import java.util.Objects;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Calendar;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        /* Total ammount of vehicles to add */
        int l_intNumberOfICEV = 3;
        Vehicle[] l_subClassVehicle = new Vehicle[l_intNumberOfICEV];

        /*
        Example for ICEV subclass
         */
        Manufacture l_classManufactureICEV_rio = new Manufacture(Manufacture.l_enumVehicle.ICEV, 203040, "Kia", "Rio", 4000, 115, Manufacture.l_enumCombustion.cc450, 2021, "Red",16750, 807060, 2);
        CombustionEngine l_subClassCombustionEngine = new CombustionEngine(l_classManufactureICEV_rio);

        l_subClassVehicle[1] = new Vehicle.ICEV(l_classManufactureICEV_rio, l_subClassCombustionEngine);
        l_subClassVehicle[1].showCharacteristics();

        /*
        Example for BEV subclass
         */
        Manufacture l_classManufactureBEV_i3 = new Manufacture(Manufacture.l_enumVehicle.BEV, 102030, "BMW", "i3", 4775, 250, 215, 2022, "White",45445, 908070, 1);
        ElectricEngine l_subClassElectricEngine = new ElectricEngine(l_classManufactureBEV_i3);

        l_subClassVehicle[0] = new Vehicle.BEV(l_classManufactureBEV_i3, l_subClassElectricEngine);
        l_subClassVehicle[0].showCharacteristics();

        /*
        Example for HybridV subclass
         */
        Manufacture l_classManufactureHybridV_530e = new Manufacture(Manufacture.l_enumVehicle.ICEV, 304050, "BMW", "530e", 4000, 420, Manufacture.l_enumCombustion.cc1000, 58, 2023, "Grey",40430, 706050, 1);
        HybridEngine l_subClassHybridEngine = new HybridEngine(l_classManufactureHybridV_530e);

        l_subClassVehicle[2] = new Vehicle.HybridV(l_classManufactureHybridV_530e, l_subClassHybridEngine);
        l_subClassVehicle[2].showCharacteristics();
    }
}