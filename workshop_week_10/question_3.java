package week_10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class question_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEgSanam;
	private JTextField txtEgRajbanshi;
	private JTextField txtEgGauradaha;
	private JTextField txtEg;
	private JTextField txtEnterSemester;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					question_3 frame = new question_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public question_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(30, 30, 96, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setBounds(30, 75, 73, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(30, 113, 84, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact Number:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(18, 147, 108, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Semester:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_4.setBounds(30, 173, 73, 28);
		contentPane.add(lblNewLabel_4);
		
		txtEgSanam = new JTextField();
		txtEgSanam.setBackground(new Color(192, 192, 192));
		txtEgSanam.setText("Eg: Sanam");
		txtEgSanam.setBounds(136, 38, 135, 27);
		contentPane.add(txtEgSanam);
		txtEgSanam.setColumns(10);
		
		txtEgRajbanshi = new JTextField();
		txtEgRajbanshi.setBackground(new Color(192, 192, 192));
		txtEgRajbanshi.setText("Eg: rajbanshi");
		txtEgRajbanshi.setBounds(136, 73, 135, 28);
		contentPane.add(txtEgRajbanshi);
		txtEgRajbanshi.setColumns(10);
		
		txtEgGauradaha = new JTextField();
		txtEgGauradaha.setBackground(new Color(192, 192, 192));
		txtEgGauradaha.setText("Eg: Gauradaha");
		txtEgGauradaha.setBounds(136, 108, 135, 27);
		contentPane.add(txtEgGauradaha);
		txtEgGauradaha.setColumns(10);
		
		txtEg = new JTextField();
		txtEg.setBackground(new Color(192, 192, 192));
		txtEg.setText("eg: 9812345678");
		txtEg.setBounds(136, 141, 135, 28);
		contentPane.add(txtEg);
		txtEg.setColumns(10);
		
		txtEnterSemester = new JTextField();
		txtEnterSemester.setBackground(new Color(192, 192, 192));
		txtEnterSemester.setText("Eg: 2");
		txtEnterSemester.setBounds(136, 179, 135, 22);
		contentPane.add(txtEnterSemester);
		txtEnterSemester.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("User Data");
		lblNewLabel_5.setForeground(new Color(128, 64, 64));
		lblNewLabel_5.setBackground(new Color(128, 128, 192));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(147, 10, 193, 18);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("C S V");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		                String firstName = txtEgSanam.getText();
		                String lastName = txtEgRajbanshi.getText();
		                String address = txtEgGauradaha.getText();
		                String contact = txtEg.getText();
		                String semester = txtEnterSemester.getText();
		                
		                // CSV Conversion Logic
		                String csvData = firstName + "," 
		                               + lastName + "," 
		                               + address + "," 
		                               + contact + "," 
		                               + semester;

		

		                try {
		                    FileWriter writer = new FileWriter("student.csv", true);

		                    writer.write(csvData);
		                    writer.write("\n");

		                    writer.close();

		                    JOptionPane.showMessageDialog(null,
		                            "Data Saved Successfully!");

		                    // Clear Fields
		                    txtEgSanam.setText("");
		                    txtEgRajbanshi.setText("");
		                    txtEgGauradaha.setText("");
		                    txtEg.setText("");
		                    txtEnterSemester.setText("");

		                } catch (IOException ex) {
		                    JOptionPane.showMessageDialog(null,
		                            "Error Saving File!");
		                }
		            }
		        });
				
			
		btnNewButton.setBackground(new Color(0, 128, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(new Color(64, 0, 128));
		btnNewButton.setBounds(145, 222, 113, 31);
		contentPane.add(btnNewButton);

	}
}
