public class StringConcatenation {
    public static void main(String[] args) {
        int N = 10000;
        String str = "";

        // Using String (O(N²))
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str += "a"; // Creates new object each time
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + "ms");

        // Using StringBuilder (O(N))
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sb.append("a"); // Efficient mutable object
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");

        // Using StringBuffer (O(N))
        StringBuffer sbf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbf.append("a"); // Thread-safe version of StringBuilder
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ms");
    }
}