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

public class Main {
    public enum e_fileCreation {
        CREATED,
        EXISTING,
        ERROR
    }

    public static void main(String[] args) {
        /* State machine object creation */
        StateMachine l_stateMachine = new StateMachine();
        /* Boolean flag to keep the state machine running */
        boolean l_varInfiniteCycle = true;
        /* Scanner to work in local environment */
        Scanner l_varScanner = new Scanner(System.in);
        String l_strTempScanner = "";
        int l_varClassCarsLength = 0;
        int l_varClassCarsArrayCounter = 0;

        int l_varStoreInFileOption = 0;
        int l_varCreatedFilesCntr = 0;

        int l_varUsedYears = 0;

        /* Section of code added for HomeTask3 */
        Manufacture l_classManufacturer = new Manufacture();

        System.out.println("Number of cars information to register: ...");
        l_varClassCarsLength = Integer.parseInt(l_varScanner.next());
        if (l_varClassCarsLength != 0) {
            System.out.println("-------------------------------------");
        } else {
            System.out.println("No info to be added...");
            l_varInfiniteCycle = false;
        }
        /* Create class array of n positions */
        ICEV[] l_classICEV = new ICEV[l_varClassCarsLength];
        BEV[] l_classBEV = new BEV[l_varClassCarsLength];
        HybridV[] l_classHybridV = new HybridV[l_varClassCarsLength];

        CombustionEngine[] l_classCombustionEngine = new CombustionEngine[l_varClassCarsLength];
        ElectricEngine[] l_ElectricEngine = new ElectricEngine[l_varClassCarsLength];
        HybridEngine[] l_HybridEngine = new HybridEngine[l_varClassCarsLength];

        do {
            switch (l_stateMachine.getCurrentState()) {
                case IDLE -> {
                    System.out.println("-------------------------------------");
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_MAKE);
                }
                case CAR_MAKE -> {
                    System.out.print("CAR BRAND -> ");
                    l_classManufacturer.setVarCarsMake(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_ID);
                }
                case CAR_ID -> {
                    System.out.print("CAR ID -> ");
                    l_classManufacturer.setVarCarsId(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_MODEL);
                }
                case CAR_MODEL -> {
                    System.out.print("CAR MODEL -> ");
                    l_classManufacturer.setVarCarModel(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_YEAR);
                }
                case CAR_YEAR -> {
                    System.out.print("CAR YEAR -> ");
                    l_classManufacturer.setVarCarYear(Integer.parseInt(l_varScanner.next()));

                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_COLOR);
                }
                case CAR_COLOR -> {
                    System.out.print("CAR COLOR -> ");
                    l_strTempScanner = l_varScanner.next();
                    l_classManufacturer.setVarCarColor(l_varScanner.next());
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_PRICE);
                }
                case CAR_PRICE -> {
                    System.out.print("CAR PRICE -> ");
                    l_classManufacturer.setVarCarPrice(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_REGISNUM);
                }
                case CAR_REGISNUM -> {
                    System.out.print("CAR REGISTRATION NUMBER -> ");
                    l_classManufacturer.setVarCarRegistrationNumber(Integer.parseInt(l_varScanner.next()));
                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_TYPE);
                }
                case CAR_TYPE -> {
                    System.out.print("""
                            CAR TYPE -> 
                            1. ICEV
                            2. BEV
                            3. HybridV
                            """);
                    l_classManufacturer.setVarCarType(Integer.parseInt(l_varScanner.next()));

                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_ENGINEINFO);
                }
                case CAR_ENGINEINFO ->
                {
                    switch (l_classManufacturer.getVarCarType())
                    {
                        case 1 ->
                        {
                            System.out.println("""
                                    Internal Combustion Engine
                                    ---------------------------
                                    Select  Engine Combustion Volume ->
                                    1. cc450
                                    2. cc500
                                    3. cc600
                                    4. cc850
                                    5. cc1000
                                    """);
                        }
                        case 2 ->
                        {
                            System.out.println("""
                                    Battery Electric Vehicle
                                    ---------------------------
                                    Select Battery Distance [km] ->
                                    """);
                        }
                        case 3 ->
                        {
                            System.out.println("""
                                    HybridV
                                    ---------------------------
                                    Select  Engine Combustion Volume ->
                                    1. cc450
                                    2. cc500
                                    3. cc600
                                    4. cc850
                                    5. cc1000
                                    """);
                            l_classManufacturer.setVarCarEngineVolume(Integer.parseInt(l_varScanner.next()));

                            System.out.println("""
                                    HybridV
                                    ---------------------------
                                    Select Battery Distance [km] ->
                                    """);
                            l_classManufacturer.setVarCarBatteryDistance(Integer.parseInt(l_varScanner.next()));
                        }
                        default ->
                        {
                            System.out.println("""
                                    NULL 
                                    """);
                        }
                    }
                    l_classManufacturer.setVarCarType(Integer.parseInt(l_varScanner.next()));

                    l_stateMachine.stm_NextState(StateMachine.e_stateMachine.CAR_ENGINEINFO);
                }
                case CHECK_INPUT -> {
                    l_varClassCarsArrayCounter++;
                    if (l_varClassCarsArrayCounter != l_varClassCarsLength) {
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.IDLE);
                    } else {
                        l_varClassCarsArrayCounter = 0;
                        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.STORE_IN_FILE);
                    }
                }
                case STORE_IN_FILE ->
                {
                    switch (l_classManufacturer.getVarCarType())
                    {
                        case 1 ->
                        {
                            l_classICEV[l_varClassCarsArrayCounter] = new ICEV(l_classManufacturer, null);
                        }
                        case 2 ->
                        {
                            l_classBEV[l_varClassCarsArrayCounter] = new BEV(l_classManufacturer, null);
                        }
                        case 3 ->
                        {
                            l_classHybridV[l_varClassCarsArrayCounter] = new HybridV(l_classManufacturer, null);
                        }
                        default ->
                        {
                            l_classICEV[l_varClassCarsArrayCounter] = new ICEV(null, null);
                            l_classBEV[l_varClassCarsArrayCounter] = new BEV(null, null);
                            l_classHybridV[l_varClassCarsArrayCounter] = new HybridV(null, null);
                        }
                    }
                }
                case FILE_CREATION -> {

                }
                case EXIT -> {
                    System.out.println("Operations finished");
                    l_varInfiniteCycle = false;
                }
            }
        } while (l_varInfiniteCycle);
    }
}