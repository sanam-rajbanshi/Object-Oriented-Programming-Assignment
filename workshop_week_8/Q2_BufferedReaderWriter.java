import java.io.*;

// Q2: Copy one.txt to two.txt using BufferedReader & BufferedWriter (line by line)
public class Q2_BufferedReaderWriter {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("one.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("two.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Done! Content copied from one.txt to two.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
