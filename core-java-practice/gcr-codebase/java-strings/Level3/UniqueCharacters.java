import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (unique[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = ch;
                count++;
            }
        }

        System.out.println("Unique Characters:");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}