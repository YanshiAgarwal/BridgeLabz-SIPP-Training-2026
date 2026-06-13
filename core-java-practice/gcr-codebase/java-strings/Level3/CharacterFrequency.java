import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                System.out.println(ch + " : " + freq[ch]);

                freq[ch] = 0;   
            }
        }

        sc.close();
    }
}