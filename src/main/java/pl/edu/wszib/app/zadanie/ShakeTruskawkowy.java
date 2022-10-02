package pl.edu.wszib.app.zadanie;

public class ShakeTruskawkowy extends Shake implements Smak {
    @Override
    public void pij() {
        System.out.println("Pije shake");
    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }

    public static void main(String[] args) {
        ShakeTruskawkowy shake = new ShakeTruskawkowy();
        shake.pij();
        shake.smak();
    }
}
