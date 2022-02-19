package isp.lab2;

/**
 * Check readme.md file for the exercise requirements.
 *
 * @author Radu Miron
 */
public class Exercise2 {

    /**
     * Validates that the input contains only letters and commas.
     *
     * @param enumeration The input string.
     * @return The input if it's valid, null otherwise.
     */
    public static String validateEnumeration(String enumeration) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Reads and validates an enumeration of words separated by comma.
     *
     * @return The console input enumeration if it's valid, null otherwise.
     */
    public static String readAndValidateEnumeration() {
//        System.out.println("Please input an enumeration of words separated by comma:");
//        String enumeration = ...; // read the enumeration
//        return validateEnumeration(enumeration);
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Validates that the input character is a letter.
     *
     * @param startingLetter The input character.
     * @return The given character if it's valid, null otherwise.
     */
    public static Character validateStartingLetter(Character startingLetter) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Reads and validates the searched words starting letter.
     *
     * @return The starting character if it's a valid letter, null otherwise.
     */
    public static Character readAndValidateStartingLetter() {
//        System.out.println("Please input the starting letter of the words you want to search:");
//        Character c = ...; // read the starting letter
//        return validateStartingLetter(c);
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Splits a given {@link String} by comma.
     *
     * @param inputEnumeration The words' enumeration.
     * @return An array of words.
     */
    public static String[] splitEnumerationIntoWords(String inputEnumeration) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    /**
     * Finds the words starting with a given letter in an array.
     *
     * @param words          The array of words.
     * @param startingLetter The starting letter.
     * @return All the words starting with the given letter.
     */
    public static String[] findWordsStartingWith(String[] words, Character startingLetter) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    public static void main(String[] args) {
        String enumeration = readAndValidateEnumeration();
        Character startingLetter = readAndValidateStartingLetter();

        if (enumeration != null && startingLetter != null) {
            String[] words = splitEnumerationIntoWords(enumeration);
            String[] results = findWordsStartingWith(words, startingLetter);
            // print results
        } else {
            // print invalid input(s) message
        }
    }
}
