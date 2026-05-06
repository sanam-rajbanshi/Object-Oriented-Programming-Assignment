import java.io.*;
import java.util.*;

// Q3: Read numbers from numbers.txt, write odd to odd.txt and even to even.txt
public class Q3_OddEvenFiles {

    public List<Integer> read(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        reader.close();
        if (line != null) {
            for (String num : line.trim().split("\\s+"))
                numbers.add(Integer.parseInt(num));
        }
        return numbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) if (n % 2 == 0) evens.add(n);
        return evens;
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int n : numbers) if (n % 2 != 0) odds.add(n);
        return odds;
    }

    public void write(List<Integer> numbers, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (int n : numbers) { writer.write(n + ""); writer.newLine(); }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Q3_OddEvenFiles obj = new Q3_OddEvenFiles();
        List<Integer> all = obj.read("numbers.txt");
        obj.write(obj.getOdd(all), "odd.txt");
        obj.write(obj.getEven(all), "even.txt");
        System.out.println("Done! Check odd.txt and even.txt");
    }
}
