import java.io.*;
import java.util.*;

// Q7: Read students.csv and create one .txt file per column header
public class Q7_CSVToTextFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("students.csv"));

        String[] headers = reader.readLine().split(",");
        List<List<String>> columns = new ArrayList<>();
        for (int i = 0; i < headers.length; i++) columns.add(new ArrayList<>());

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            String[] values = line.split(",");
            for (int i = 0; i < headers.length; i++)
                columns.get(i).add(i < values.length ? values[i].trim() : "");
        }
        reader.close();

        for (int i = 0; i < headers.length; i++) {
            String fileName = headers[i].trim() + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String val : columns.get(i)) { writer.write(val); writer.newLine(); }
            writer.close();
            System.out.println("Created: " + fileName);
        }
        System.out.println("\nAll column files created successfully!");
    }
}
