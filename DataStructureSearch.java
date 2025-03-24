import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearch {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) arr[i] = i;

        // Array Search (O(N))
        long startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 999) break; // Linear search
        }
        long endTime = System.nanoTime();
        System.out.println("Array Search Time: " + (endTime - startTime) + "ns");

        // HashSet Search (O(1))
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : arr) hashSet.add(i);
        startTime = System.nanoTime();
        hashSet.contains(999); // Constant time lookup
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) + "ns");

        // TreeSet Search (O(log N))
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : arr) treeSet.add(i);
        startTime = System.nanoTime();
        treeSet.contains(999); // Logarithmic time lookup
        endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) + "ns");
    }
}