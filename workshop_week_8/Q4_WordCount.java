import java.io.*;

// Q4: Read a text file and count total number of words
public class Q4_WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        int wordCount = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                wordCount += words.length;
            }
        }
        reader.close();

        System.out.println("Total words in file: " + wordCount);
    }
}
