import java.io.*;

// Q1: Copy content from one.txt to two.txt using BufferedInputStream & BufferedOutputStream
public class Q1_BufferedStreams {
    public static void main(String[] args) {
        // Make sure one.txt exists in your project folder
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("one.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("two.txt"))
        ) {
            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
            System.out.println("Done! Content copied from one.txt to two.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
