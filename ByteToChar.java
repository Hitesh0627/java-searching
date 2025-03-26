import java.io.*;

public class ByteToChar {
    public static void main(String[] args) {
        String filePath = "data.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8"); // Conversion
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            // Read and print the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
/*
this is the first line
this is second line
this is the third and last line
 */