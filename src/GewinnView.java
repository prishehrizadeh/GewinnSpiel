import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {

    JLabel rundenErgebnisLabel;
    JLabel gesamtpunkteLabel;
    JTextField eingabeFeld;
    JTextField computerzahlLabel;
    JButton button;

    public GewinnView() {
        setTitle("Zahlen-Gewinnspiel (v1.0)");
        setSize(900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // TOP PANEL: Zwei weiße Boxen nebeneinander
        JPanel topPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setBackground(new Color(240, 240, 240));

        // Linke Box: Rundenergebnis
        JPanel rundenBox = new JPanel(new BorderLayout());
        rundenBox.setBackground(Color.WHITE);
        rundenBox.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JLabel rundenTitel = new JLabel("Rundenergebnis:");
        rundenTitel.setFont(new Font("Arial", Font.BOLD, 12));
        rundenTitel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        rundenErgebnisLabel = new JLabel("0");
        rundenErgebnisLabel.setFont(new Font("Arial", Font.BOLD, 16));
        rundenErgebnisLabel.setHorizontalAlignment(JLabel.CENTER);
        rundenErgebnisLabel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        rundenBox.add(rundenTitel, BorderLayout.NORTH);
        rundenBox.add(rundenErgebnisLabel, BorderLayout.CENTER);
        topPanel.add(rundenBox);

        // Rechte Box: Gesamtpunkte
        JPanel punkteBox = new JPanel(new BorderLayout());
        punkteBox.setBackground(Color.WHITE);
        punkteBox.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JLabel punkteTitel = new JLabel("Gesamtpunkte:");
        punkteTitel.setFont(new Font("Arial", Font.BOLD, 12));
        punkteTitel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        gesamtpunkteLabel = new JLabel("30");
        gesamtpunkteLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gesamtpunkteLabel.setHorizontalAlignment(JLabel.CENTER);
        gesamtpunkteLabel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        punkteBox.add(punkteTitel, BorderLayout.NORTH);
        punkteBox.add(gesamtpunkteLabel, BorderLayout.CENTER);
        topPanel.add(punkteBox);

        add(topPanel, BorderLayout.NORTH);

        // CENTER PANEL: Zwei Spalten (Links/Rechts)
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 20, 15));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        centerPanel.setBackground(new Color(240, 240, 240));

        // Linke Spalte oben: Instruktion
        JLabel instrLabel = new JLabel("Tippe eine Zahl von 1 bis 9");
        instrLabel.setFont(new Font("Arial", Font.BOLD, 14));
        centerPanel.add(instrLabel);

        // Rechte Spalte oben: Gesamtpunkte Wert (weiße Box)
        JPanel punkteWertBox = new JPanel(new BorderLayout());
        punkteWertBox.setBackground(Color.WHITE);
        punkteWertBox.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        JLabel punkteWertLabel = new JLabel("Gesamtpunkte: 30");
        punkteWertLabel.setFont(new Font("Arial", Font.BOLD, 14));
        punkteWertLabel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        punkteWertBox.add(punkteWertLabel, BorderLayout.CENTER);
        centerPanel.add(punkteWertBox);

        // Linke Spalte unten: Eingabe
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        inputPanel.setBackground(new Color(240, 240, 240));
        JLabel deineZahlLabel = new JLabel("Deine Zahl:");
        deineZahlLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        eingabeFeld = new JTextField(15);
        inputPanel.add(deineZahlLabel);
        inputPanel.add(eingabeFeld);
        centerPanel.add(inputPanel);

        // Rechte Spalte unten: Computerzahl
        JPanel computerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        computerPanel.setBackground(new Color(240, 240, 240));
        JLabel computerLabel = new JLabel("Computer:");
        computerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        computerzahlLabel = new JTextField(15);
        computerzahlLabel.setEditable(false);
        computerPanel.add(computerLabel);
        computerPanel.add(computerzahlLabel);
        centerPanel.add(computerPanel);

        add(centerPanel, BorderLayout.CENTER);

        // BOTTOM PANEL: Button
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        bottomPanel.setBackground(new Color(240, 240, 240));

        button = new JButton("Noch einmal!");
        button.setPreferredSize(new Dimension(150, 40));
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        bottomPanel.add(button);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}