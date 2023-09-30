public class Vehicle
{
    public enum l_enumVehicle
    {
        ICEV,
        BEV,
        HYBRIDV
    }
    public l_enumVehicle l_enumVehicleType;
    public Vehicle()
    {
        System.out.println("Empty constructor called");
    }

    public Vehicle(l_enumVehicle l_enumVehicleType) {
        this.l_enumVehicleType = l_enumVehicleType;
    }
}
