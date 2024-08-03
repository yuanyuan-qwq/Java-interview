import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {

    public static void textAnalysis(String input) {
        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();
        Map<Character, Integer> specialCharacters = new HashMap<>();

        String longestWord = "";
        String[] words = input.split("\\s+");   // split the input string by whitespace then save in array

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                vowels.put(ch, vowels.getOrDefault(ch, 0) + 1);
            } else if (isConsonant(ch)) {
                consonants.put(ch, consonants.getOrDefault(ch, 0) + 1);
            } else {
                specialCharacters.put(ch, specialCharacters.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.print("Vowels: ");
        printCounts(vowels);

        System.out.print("Consonants: ");
        printCounts(consonants);

        System.out.print("Other characters: ");
        printCounts(specialCharacters);

        System.out.println("The longest word: " + longestWord);
    }

    private static boolean isVowel(char ch) {       //AEIOU
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    private static boolean isConsonant(char ch) {   //A-Z
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') && !isVowel(ch);
    }

    private static void printCounts(Map<Character, Integer> map) {
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if(key != ' '){
                System.out.print(Character.toUpperCase(key) + "(" + value + ") ");
            }
            else{
                System.out.print("[blank space]" + "(" + value + ") ");
            }
        }
        System.out.println(); 
    }


}
