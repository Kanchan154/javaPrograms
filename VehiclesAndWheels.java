import java.util.*;

public class VehiclesAndWheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v, w;
        System.out.println("Enter the number of vehicles : ");
        v = sc.nextInt();

        System.out.println("Enter the number of wheels: ");
        w = sc.nextInt();

        // checking that input data is invalid or not
        if (w < 2 * v || w > 4 * v || w % 2 != 0) {
            System.out.println("Invalid Data");
            return;
        }

        // finding the number of 2 vehicels and 4 vehicles
        int x = (w - 2 * v) / 2; // for 4 wheelers
        int y = (v - x); // for 2 wheelers

        System.out.println("Number of 4 wheelers are : " + x + " and number of 2 Wheelers are: " + y);
    }

}
