import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputText = "abc cba 1237 hello art no xyz";

        String[] result = findWordsWithIncreasingChars(inputText);

        System.out.println("Input string: " + inputText);
        System.out.println("Found words: " + Arrays.toString(result));
    }

    public static String[] findWordsWithIncreasingChars(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }

        String[] words = text.trim().split("[\\s\\p{Punct}]+");
        List<String> matchingWords = new ArrayList<>();

        for (String word : words) {
            if (isCharOrderIncreasing(word)) {
                matchingWords.add(word);
            }
        }

        return matchingWords.toArray(new String[0]);
    }

    private static boolean isCharOrderIncreasing(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) >= word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
