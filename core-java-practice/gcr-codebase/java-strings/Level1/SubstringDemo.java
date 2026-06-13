import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub = "";

        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }

        String builtIn = text.substring(start, end);

        System.out.println("Using charAt(): " + sub);
        System.out.println("Using substring(): " + builtIn);
        System.out.println("Equal? " + sub.equals(builtIn));

        sc.close();
    }
}