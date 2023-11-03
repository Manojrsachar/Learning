package Part1;

public class ToggleAlphabet {
    public static void main(String[] args) {
        int n = 10; // Number of characters to display
        char currentChar = 'A'; // Start with 'A'

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(currentChar)) {
                System.out.print(currentChar);
            } else {
                System.out.print(Character.toLowerCase(currentChar));
            }

            // Toggle to the next character
            currentChar = (char) (currentChar + 1);

            // Wrap around to 'A' if necessary
            if (currentChar > 'Z') {
                currentChar = 'A';
            }
        }

        System.out.println(); // Print a newline after the characters
    }
}

