import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(filePath, true); // Append mode enabled
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text to write to file (type 'exit' to stop):");
            String line;

            // Read user input until 'exit' is entered
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Move to the next line
            }

            bufferedWriter.flush();
            System.out.println("User input successfully written to " + filePath);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
/*
Enter text to write to file (type 'exit' to stop):
line one
line two
exit
User input successfully written to output.txt

output.txt:
line one
line two

 */