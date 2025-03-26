import java.io.*;

public class ReadComparison {
    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt";

        System.out.println("For 1MB File:");
        printComparison(filePath, 1_000_000);

        System.out.println("\nFor 100MB File:");
        printComparison(filePath, 100_000_000);

        System.out.println("\nFor 500MB File:");
        printComparison(filePath, 500_000_000);

        System.out.println("For 1,000 Concatenation");
        printComparison(1_000);

        System.out.println("For 10,000 Concatenation");
        printComparison(10_000);

        System.out.println("For 1,000,000 Concatenation");
        printComparison(1_000_000);
    }

    static void printComparison(String filePath, int bytesToRead) throws IOException {
        // FileReader (Character Stream)
        long time = System.nanoTime();
        readUsingFileReader(filePath, bytesToRead);
        System.out.println("Time taken for FileReader: " + ((System.nanoTime() - time) / 1_000_000.0) + " ms");

        // InputStreamReader (Byte Stream)
        time = System.nanoTime();
        readUsingInputStreamReader(filePath, bytesToRead);
        System.out.println("Time taken for InputStreamReader: " + ((System.nanoTime() - time) / 1_000_000.0) + " ms");
    }

    // Method to print comparison between String, StringBuilder and StringBuffer concatenation
    static void printComparison(int operationCount){
        String string = new String("hello");
        long time = System.nanoTime();
        for(int i = 0 ; i < operationCount ; i++){
            string.concat("hello");
        }
        System.out.println("Time taken for String: " + ((System.nanoTime() - time)/1_000_000.0) + " ms");

        StringBuilder stringBuilder = new StringBuilder("hello");
        time = System.nanoTime();
        for(int i = 0 ; i < operationCount ; i++){
            stringBuilder.append("hello");
        }
        System.out.println("Time taken for StringBuilder: " + ((System.nanoTime() - time)/1_000_000.0) + " ms");

        StringBuffer stringBuffer = new StringBuffer("hello");
        time = System.nanoTime();
        for(int i = 0 ; i < operationCount ; i++){
            stringBuffer.append("hello");
        }
        System.out.println("Time taken for StringBuffer: " + ((System.nanoTime() - time)/1_000_000.0) + " ms");
    }

    // Method to read file using FileReader
    static void readUsingFileReader(String filePath, int bytesToRead) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        char[] buffer = new char[1024]; // Reads 1024 characters chunks
        int bytesRead = 0, totalRead = 0;
        while ((bytesRead = fileReader.read(buffer)) != -1 && totalRead < bytesToRead) {
            totalRead += bytesRead;
        }
        fileReader.close();
    }

    // Method to read file using InputStreamReader
    static void readUsingInputStreamReader(String filePath, int bytesToRead) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
        char[] buffer = new char[1024]; // // Reads 1024 characters chunks
        int bytesRead = 0, totalRead = 0;
        while ((bytesRead = inputStreamReader.read(buffer)) != -1 && totalRead < bytesToRead) {
            totalRead += bytesRead;
        }
        inputStreamReader.close();
    }
}
/*
For 1MB File:
Time taken for FileReader: 11.6562 ms
Time taken for InputStreamReader: 5.4276 ms

For 100MB File:
Time taken for FileReader: 62.1989 ms
Time taken for InputStreamReader: 46.5135 ms

For 500MB File:
Time taken for FileReader: 219.0187 ms
Time taken for InputStreamReader: 219.115 ms

For 1,000 Concatenation
Time taken for String: 0.7536 ms
Time taken for StringBuilder: 0.0575 ms
Time taken for StringBuffer: 0.0733 ms
For 10,000 Concatenation
Time taken for String: 1.0635 ms
Time taken for StringBuilder: 0.5201 ms
Time taken for StringBuffer: 0.6375 ms
For 1,000,000 Concatenation
Time taken for String: 21.2417 ms
Time taken for StringBuilder: 7.932 ms
Time taken for StringBuffer: 22.7451 ms
 */