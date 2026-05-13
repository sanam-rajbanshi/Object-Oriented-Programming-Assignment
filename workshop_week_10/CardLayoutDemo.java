package week_10;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create CardLayout
        CardLayout cardLayout = new CardLayout();

        // Panel using CardLayout
        JPanel cardPanel = new JPanel(cardLayout);

        // Card 1
        JPanel card1 = new JPanel();
        card1.setBackground(Color.CYAN);
        card1.add(new JLabel("This is Card 1"));

        // Card 2
        JPanel card2 = new JPanel();
        card2.setBackground(Color.PINK);
        card2.add(new JLabel("This is Card 2"));

        // Card 3
        JPanel card3 = new JPanel();
        card3.setBackground(Color.LIGHT_GRAY);
        card3.add(new JLabel("This is Card 3"));

        // Add cards
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

        // Buttons
        JPanel buttonPanel = new JPanel();

        JButton btnFirst = new JButton("First");
        JButton btnNext = new JButton("Next");
        JButton btnPrevious = new JButton("Previous");
        JButton btnLast = new JButton("Last");

        buttonPanel.add(btnFirst);
        buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);
        buttonPanel.add(btnLast);

        // Button actions
        btnFirst.addActionListener(e -> cardLayout.first(cardPanel));

        btnNext.addActionListener(e -> cardLayout.next(cardPanel));

        btnPrevious.addActionListener(e -> cardLayout.previous(cardPanel));

        btnLast.addActionListener(e -> cardLayout.last(cardPanel));

        // Add panels to frame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}