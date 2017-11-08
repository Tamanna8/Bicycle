package sharmat;

import java.util.Scanner;

/**
 *
 * @author Tamanna Sharma
 */
public class BicycleProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Front:");
        System.out.println("0 means 12 teeth");
        System.out.println("1 means 15 teeth");
        System.out.println("Back:");
        System.out.println("0 means 5 teeth");
        System.out.println("1 means 7 teeth");

        System.out.println(" Enter Front Gear #: ");
        int frontGear = scanIn.nextInt();
        System.out.println(" Enter Back Gear #: ");
        int backGear = scanIn.nextInt();

        Gear[] front = {new Gear(12), new Gear(15)};
        Gear[] back = {new Gear(5), new Gear(7)};
        Bicycle bicycle = new Bicycle(front, back);

        System.out.println(" Your Gear Ratio is "
                + bicycle.getGearRatio(frontGear, backGear));

    }

}
