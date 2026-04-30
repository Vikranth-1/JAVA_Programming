import java.io.File;
import java.util.Scanner;

public class WordLineCount {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            int lineCount = 0;
            int wordCount = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;

                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            sc.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}