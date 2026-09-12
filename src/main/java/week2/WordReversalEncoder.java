package week2;

public class WordReversalEncoder {

    public static void main(String[] args) {

        String sentence = "hello club";

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}