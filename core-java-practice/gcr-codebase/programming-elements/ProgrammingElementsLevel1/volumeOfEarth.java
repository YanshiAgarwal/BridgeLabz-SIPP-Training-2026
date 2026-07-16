import java.util.Scanner;

public class volumeOfEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Earth in km: ");
        double radiusKm = sc.nextDouble();

        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of earth in cubic miles is " + volumeMiles);

    }
}
