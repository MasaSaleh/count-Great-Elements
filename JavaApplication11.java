package javaapplication11;
import java.util.Arrays;
import java.util.TreeMap;

public class JavaApplication11 {

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 1, 9, 11, 5};
        int[] result = countGreaterElements(arr);

        // Print the result
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Result Array: " + Arrays.toString(result));
    }

    public static int[] countGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            treeMap.put(arr[i], treeMap.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int key : treeMap.keySet()) {
                if (key > arr[i]) {
                    count += treeMap.get(key);
                }
            }
            result[i] = count;
        }

        return result;
    }
}
