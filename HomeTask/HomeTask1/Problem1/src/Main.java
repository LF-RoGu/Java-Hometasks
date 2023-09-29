import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Volume l_classVolume = new Volume();

        System.out.println("The volume of Earth is... " + l_classVolume.get_varVolumeEarth() + " cubic meters");
        System.out.println("The volume of the Sun is... " + l_classVolume.get_varVolumeSun() + " cubic meters");

    }
}
