package week1;

public class TypingAccuracyChecker {

    public static void main(String[] args) {

        String original = "Java is fun";
        String typed = "Java is fan";

        String[] originalWords = original.split(" ");
        String[] typedWords = typed.split(" ");

        int correctWords = 0;

        for (int i = 0; i < originalWords.length; i++) {

            if (originalWords[i].equals(typedWords[i])) {
                correctWords++;
            }
        }

        double accuracy = (correctWords * 100.0) / originalWords.length;

        System.out.println("Accuracy: " + accuracy + "%");
    }
}