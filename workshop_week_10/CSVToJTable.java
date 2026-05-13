package week_10;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSVToJTable {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CSV Data in JTable");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Column Names
        String[] columns = {
                "FIRST_NAME",
                "LAST_NAME",
                "ADDRESS",
                "CONTACT_NUMBER",
                "SEMESTER"
        };

        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;

            // Skip Header Line
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Split only into 5 parts
                String[] data = line.split(",", 5);

                if (data.length == 5) {
                    model.addRow(data);
                }
            }

            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }

        JScrollPane pane = new JScrollPane(table);
        frame.add(pane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}