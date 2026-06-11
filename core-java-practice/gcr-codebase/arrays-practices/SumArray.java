import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Enter Number: ");
            double n = sc.nextDouble();

            if (n <= 0)
                break;

            arr[count] = n;
            count++;
        }

        double sum = 0;

        System.out.println("Numbers Entered:");

        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}