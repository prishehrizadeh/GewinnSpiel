import javax.swing.*;

public class GewinnView extends JFrame {

    JLabel gesamtpunkteLabel;
    JLabel rundenErgebnisLabel;
    JTextField eingabeFeld;
    JLabel computerzahlLabel;
    JButton button;

    public GewinnView() {
        setTitle("Zahlen-Gewinnspiel");
        setSize(450, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        gesamtpunkteLabel = new JLabel("Gesamtpunkte: 30");
        gesamtpunkteLabel.setBounds(30, 20, 150, 30);
        add(gesamtpunkteLabel);

        rundenErgebnisLabel = new JLabel("Runde: 0");
        rundenErgebnisLabel.setBounds(220, 20, 120, 30);
        add(rundenErgebnisLabel);

        JLabel deineZahlLabel = new JLabel("Deine Zahl (1-9):");
        deineZahlLabel.setBounds(30, 70, 130, 30);
        add(deineZahlLabel);

        eingabeFeld = new JTextField();
        eingabeFeld.setBounds(170, 70, 100, 30);
        add(eingabeFeld);

        JLabel computerLabel = new JLabel("Computerzahl:");
        computerLabel.setBounds(30, 110, 130, 30);
        add(computerLabel);

        computerzahlLabel = new JLabel("-");
        computerzahlLabel.setBounds(170, 110, 100, 30);
        add(computerzahlLabel);

        button = new JButton("Noch einmal!");
        button.setBounds(120, 160, 150, 30);
        add(button);

        setVisible(true);
    }
}