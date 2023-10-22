import java.util.*;

class ArrayShuffler {
    public void ShuffleNumber(int[] arr) {
        try {
            if (arr == null || arr.length < 2) {
                System.out.println("The array is null or too small to shuffle.");
            }
            int n = arr.length;
            Random random = new Random();
            for (int i = n - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                swap(arr, i, j);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

public class Shuffle {
    public static void main(String[] args) {
        try {
            int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
            ArrayShuffler imp = new ArrayShuffler();
            imp.ShuffleNumber(arr);
            System.out.println(Arrays.toString(arr));
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}