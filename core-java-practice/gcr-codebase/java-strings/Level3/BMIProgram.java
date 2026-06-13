import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;   // cm to m

            double bmi = weight / (height * height);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            System.out.printf("%.0f\t%.0f\t%.2f\t%s\n",
                    data[i][1], weight, bmi, status);
        }

        sc.close();
    }
}