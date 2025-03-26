import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileLines {
    // Method to read lines in a file
    static void readFileLines(String filepath) throws Exception {
        FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null){   // EOF
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }

    public static void main(String[] args){
        try {
            readFileLines("data.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
/*
this is the first line
this is second line
this is the third and last line
 */