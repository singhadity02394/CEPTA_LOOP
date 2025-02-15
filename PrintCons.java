package cetpa;

public class PrintCons {
    public static void main(String[] args) {
        // Loop through all uppercase alphabets and print consonants
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // Check if the character is a vowel
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                System.out.print(ch + " ");
            }
        }
    }
}

