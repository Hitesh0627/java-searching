public class ConcatenateStrings {
    // Method to concatenate two strings using string buffer
    static String concatenateStrings(String[] stringArray){
        StringBuffer stringBuffer = new StringBuffer();
        for (String string: stringArray){
            stringBuffer.append(string);    // appending each string in array to the String Buffer
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};
        System.out.println("Concatenated String: " + concatenateStrings(strings));
    }
}
/*
Concatenated String: onetwothree
 */