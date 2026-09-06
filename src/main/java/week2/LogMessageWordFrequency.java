package week2;

import java.util.HashMap;
import java.util.Map;

public class LogMessageWordFrequency {

    public static void main(String[] args) {

        String log = "error warning error info warning error";

        String[] words = log.split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}