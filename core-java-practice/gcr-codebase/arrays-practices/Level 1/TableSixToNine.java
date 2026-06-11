import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int result[] = new int[4];

        int j = 0;

        for (int i = 6; i <= 9; i++) {
            result[j] = num * i;
            j++;
        }

        j = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + result[j]);
            j++;
        }
    }
}