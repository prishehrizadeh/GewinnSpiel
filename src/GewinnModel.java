public class GewinnModel {
    private int gesamtPunkte = 30;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public void berechneComputerZahl() {
        computerZahl = (int)(Math.random() * 9) + 1;
    }

    public void berechneRunde(int spielerZahl) {
        this.spielerZahl = spielerZahl;

        if (spielerZahl == computerZahl) {
            rundenErgebnis = 20;
        } else if (Math.abs(spielerZahl - computerZahl) == 1) {
            rundenErgebnis = 5;
        } else {
            rundenErgebnis = -10;
        }

        gesamtPunkte += rundenErgebnis;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public boolean hatGewonnen() {
        return gesamtPunkte >= 100;
    }

    public boolean hatVerloren() {
        return gesamtPunkte <= 0;
    }
}