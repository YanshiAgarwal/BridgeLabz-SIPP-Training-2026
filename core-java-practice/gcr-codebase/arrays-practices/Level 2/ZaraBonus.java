import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary[] = new double[10];
        double service[] = new double[10];
        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        double totalBonus = 0;
        double oldTotal = 0;
        double newTotal = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = sc.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (service[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            oldTotal += salary[i];
            newTotal += newSalary[i];
        }

        System.out.println("\nTotal Old Salary = " + oldTotal);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + newTotal);

        sc.close();
    }
}