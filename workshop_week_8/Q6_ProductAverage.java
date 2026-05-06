import java.io.*;
import java.util.*;

// Q6: Read products.txt, find average price per product, export to averages.csv
public class Q6_ProductAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("products.txt"));
        Map<String, List<Double>> productPrices = new LinkedHashMap<>();

        String line;
        boolean firstLine = true;
        while ((line = reader.readLine()) != null) {
            if (firstLine) { firstLine = false; continue; }
            line = line.trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(";");
            String name = parts[0].trim();
            double price = Double.parseDouble(parts[1].trim().replace(",", ""));
            productPrices.computeIfAbsent(name, k -> new ArrayList<>()).add(price);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("averages.csv"));
        writer.write("PRODUCT,AVERAGE_PRICE");
        writer.newLine();

        for (Map.Entry<String, List<Double>> entry : productPrices.entrySet()) {
            double sum = 0;
            for (double p : entry.getValue()) sum += p;
            double avg = sum / entry.getValue().size();
            writer.write(entry.getKey() + "," + String.format("%.2f", avg));
            writer.newLine();
            System.out.println(entry.getKey() + " -> Average: " + String.format("%.2f", avg));
        }
        writer.close();
        System.out.println("\nAverage prices saved to averages.csv");
    }
}
