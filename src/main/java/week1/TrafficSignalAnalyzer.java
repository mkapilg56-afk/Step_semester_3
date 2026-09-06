package week1;

public class TrafficSignalAnalyzer {

    public static void main(String[] args) {

        char[] signals = {'G', 'R', 'G', 'G', 'G', 'Y', 'R'};

        int currentStreak = 0;
        int longestStreak = 0;

        for (char signal : signals) {

            if (signal == 'G') {
                currentStreak++;

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }

            } else {
                currentStreak = 0;
            }
        }

        System.out.println("Longest Green Streak: " + longestStreak);
    }
}