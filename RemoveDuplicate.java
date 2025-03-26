import java.util.HashSet;

public class RemoveDuplicate {
    // Method to remove duplicate characters using string builder
    static String removeDuplicateCharacters(String string){
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> charactersSet = new HashSet<>();

        for (int i = 0 ; i < string.length() ; i++){
            char ch = string.charAt(i);
            if (!charactersSet.contains(ch)){   // check if character has already been added
                charactersSet.add(ch);
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();    // return string builder as string
    }

    public static void main(String[] args) {
        String string = "Hello everyone";
        System.out.println("String '" + string + "' after removing duplicate characters: " + removeDuplicateCharacters(string));
    }
}
/*
String 'Hello everyone' after removing duplicate characters: Helo vryn
 */