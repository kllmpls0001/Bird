import java.awt.*;

public class Sparrow extends Bird {
    private static String name;
    private static int kat = 0;

    public static void fly() {
        System.out.println("Я умею летать");
    }

    public Sparrow(String name) {
        x = 180;
        y = 180;
        color = Color.red;
        Size = 7;
        this.name = name;
        System.out.println("Я воробей " + name + "!");
        kat++;
        System.out.println("Я воробей № " + kat);
    }
}