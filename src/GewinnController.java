import javax.swing.*;

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
        });

        view.button.setEnabled(false);
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

            view.eingabeFeld.setEnabled(false);
            view.button.setEnabled(true);

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