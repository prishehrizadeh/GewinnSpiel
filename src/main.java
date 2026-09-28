public class main {

    public static void main(String[] args) {

        GewinnModel model = new GewinnModel();
        GewinnView view = new GewinnView();
        new GewinnController(model, view);

    }
}