import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        String[] words = new String[spaces + 1];

        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                words[index] = temp;
                index++;
                temp = "";
            } else {
                temp += ch;
            }
        }

        words[index] = temp;

        String[] builtIn = text.split(" ");

        boolean same = true;

        if (words.length != builtIn.length) {
            same = false;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(builtIn[i])) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Words using user logic:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Same as split()? " + same);

        sc.close();
    }
}