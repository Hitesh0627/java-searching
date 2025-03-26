public class ConcatenationCompare {

    // Method to concatenate a million 'hello' strings using string buffer
    static String concatenateStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i < 1000000 ; i++){
            stringBuffer.append("hello");
        }
        return stringBuffer.toString();
    }

    // Method to concatenate a million 'hello' strings using string builder
    static String concatenateStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < 1000000 ; i++){
            stringBuilder.append("hello");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        long time = System.nanoTime();
        concatenateStringBuffer();
        time = System.nanoTime() - time;
        System.out.println("Time taken for String Buffer: " + time + " ns");
        time = System.nanoTime();
        concatenateStringBuilder();
        time = System.nanoTime() - time;
        System.out.println("Time taken for String Builder: " + time + " ns");
    }
}
