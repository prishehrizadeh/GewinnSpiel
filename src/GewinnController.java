import javax.swing.*;
import java.awt.*;

public class GewinnController {

    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {
        this.model = model;
        this.view = view;

        view.eingabeFeld.addActionListener(e -> spieleRunde());

        view.button.addActionListener(e -> {
            view.eingabeFeld.setText("");
            view.eingabeFeld.setEnabled(true);
            view.button.setEnabled(false);
            view.button.setText("Noch einmal!");

            view.gesamtpunkteLabel.setForeground(Color.WHITE);
            view.rundenErgebnisLabel.setForeground(Color.WHITE);
        });

        view.button.setEnabled(false);
        view.button.setText("Noch einmal!");

        view.gesamtpunkteLabel.setForeground(Color.WHITE);
        view.rundenErgebnisLabel.setForeground(Color.WHITE);
    }

    private void spieleRunde() {
        try {
            int zahl = Integer.parseInt(view.eingabeFeld.getText());

            if (zahl < 1 || zahl > 9) {
                JOptionPane.showMessageDialog(view, "Bitte eine Zahl von 1 bis 9 eingeben!");
                return;
            }

            model.berechneComputerZahl();
            model.berechneRunde(zahl);

            view.computerzahlLabel.setText(
                    String.valueOf(model.getComputerZahl())
            );

            view.gesamtpunkteLabel.setText(
                    "Gesamtpunkte: " + model.getGesamtPunkte()
            );

            view.rundenErgebnisLabel.setText(
                    "Runde: " + model.getRundenErgebnis()
            );

            if (model.getRundenErgebnis() > 0) {
                view.gesamtpunkteLabel.setForeground(Color.GREEN);
                view.rundenErgebnisLabel.setForeground(Color.GREEN);
            } else if (model.getRundenErgebnis() < 0) {
                view.gesamtpunkteLabel.setForeground(Color.RED);
                view.rundenErgebnisLabel.setForeground(Color.RED);
            } else {
                view.gesamtpunkteLabel.setForeground(Color.WHITE);
                view.rundenErgebnisLabel.setForeground(Color.WHITE);
            }

            view.eingabeFeld.setEnabled(false);
            view.button.setEnabled(true);
            view.button.setText("Neue Runde");

            if (model.hatGewonnen()) {
                JOptionPane.showMessageDialog(view, "Du hast gewonnen!");
            }

            if (model.hatVerloren()) {
                JOptionPane.showMessageDialog(view, "Du hast verloren!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Bitte eine Zahl eingeben!");
        }
    }
}

