import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        System.out.println("Word\tLength");

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            try {
                while (true) {
                    words[i].charAt(count);
                    count++;
                }
            } catch (Exception e) {
            }

            System.out.println(words[i] + "\t" + count);
        }

        sc.close();
    }
}
