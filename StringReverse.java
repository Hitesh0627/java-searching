public class StringReverse {
    // Method to reverse a string using StringBuilder
    static String reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder();  // StringBuilder Object
        stringBuilder.append(string);   // Appending the string to string builder object
        stringBuilder.reverse();    // reversing string
        return stringBuilder.toString();    // returning string builder object as string
    }

    public static void main(String[] args) {
        String string = "Hello";
        System.out.println("Reverse of " + string + " is " + reverseString(string));
    }
}
/*
Reverse of Hello is olleH
 */