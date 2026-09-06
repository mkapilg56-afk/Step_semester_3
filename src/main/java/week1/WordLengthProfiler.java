package week1;

public class WordLengthProfiler {

    public static void main(String[] args) {

        String review = "Java is very interesting";

        String[] words = review.split(" ");

        for (String word : words) {
            System.out.println(word + " -> " + word.length());
        }
    }
}