import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String targetWord = "this";

        int wordCount = countWordOccurrences(filePath, targetWord);

        System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
    }

    // Function to count occurrences of a word in a file
    public static int countWordOccurrences(String filePath, String targetWord) {
        int wordCount = 0;

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split each line into words
                String[] words = line.split(" "); // Splitting by whitespace

                // Check each word in the line
                for (String word : words) {
                    // Compare with target word
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return wordCount;
    }
}
/*
The word 'this' appears 3 times in the file.
 */