public class FirstNegativeSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 0, -3, 6, -4};
        System.out.println("First Negative integer in the array at index: " + findFirstNegative(array));
    }

    // Method to check the index of first negative index
    static int findFirstNegative(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < 0){
                return i;
            }
        }
        return -1;
    }
}
/*
First Negative integer in the array at index: 4
 */