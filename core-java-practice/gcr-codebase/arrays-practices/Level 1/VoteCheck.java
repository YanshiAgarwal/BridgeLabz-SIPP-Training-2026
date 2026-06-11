import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid Age");
            } else if (ages[i] >= 18) {
                System.out.println(ages[i] + " -> Can Vote");
            } else {
                System.out.println(ages[i] + " -> Cannot Vote");
            }
        }
    }
}