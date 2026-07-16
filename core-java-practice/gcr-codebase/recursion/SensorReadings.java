import java.util.Scanner;

public class SensorReadings {

    public static boolean isIncreasing(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sensor readings: ");
        int n = sc.nextInt();

        int[] readings = new int[n];

        System.out.println("Enter the sensor readings:");

        for (int i = 0; i < n; i++) {
            readings[i] = sc.nextInt();
        }

        boolean result;

        if (n <= 1) {
            result = true;
        } else {
            result = isIncreasing(readings, 0);
        }

        if (result) {
            System.out.println("The sensor readings are strictly increasing.");
        } else {
            System.out.println("The sensor readings are NOT strictly increasing.");
        }
    }
}