
public class Main {
    public static void main(String[] args) {

        Navigator navigator = new Navigator(1000);

        new Thread(navigator).start();
    }
}
