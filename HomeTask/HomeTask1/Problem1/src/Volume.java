import java.lang.Math;

public class Volume
{
    private double l_varDiameterEarth = 7600;
    private double l_varDiameterSun = 865000;
    // Calculate the radius (half of the diameter)
    private double l_varRadiusEarth = l_varDiameterEarth / 2;
    private double l_varRadiusSun = l_varDiameterSun / 2;
    // Convert the diameter from miles to meters (1 mile = 1609.34 meters)
    private double l_varRadiusEarthMts = l_varRadiusEarth * 1609.34;
    private double l_varRadiusSunMts = l_varRadiusSun * 1609.34;




    // Calculate the volume of the sphere
    private double l_varVolumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(l_varRadiusEarthMts, 3);
    private double l_varVolumeSun = (4.0 / 3.0) * Math.PI * Math.pow(l_varRadiusSunMts, 3);

    public double get_varVolumeEarth() {
        return l_varVolumeEarth;
    }
    public double get_varVolumeSun(){
        return l_varVolumeSun;
    }
}
