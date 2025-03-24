import java.io.*;

public class FileReading {
    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt";

        // Using FileReader (Character Stream)
        long startTime = System.currentTimeMillis();
        try (FileReader fr = new FileReader(filePath)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                // Read character by character
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + "ms");

        // Using InputStreamReader (Byte Stream)
        startTime = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            int ch;
            while ((ch = isr.read()) != -1) {
                // Read bytes and convert to characters
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + "ms");
    }
}