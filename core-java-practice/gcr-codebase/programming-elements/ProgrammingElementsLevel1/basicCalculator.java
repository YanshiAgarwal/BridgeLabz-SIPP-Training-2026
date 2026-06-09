import java.util.*;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers is "
                + add + ", " + sub + ", " + mul + ", and " + div);

        sc.close();
    }
}
