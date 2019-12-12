import java.awt.*;

public class Penguin extends Bird {
    public static String name;
    private static int kot = 0;

    public static void fly() {
        System.out.println("Я не умею летать");
    }

    public Penguin(String name) {
        x = 70;
        y = 70;
        color = Color.black;
        Size = 20;
        this.name = name;
        System.out.println("Я пингвин " + name + "!");
        kot++;
        System.out.println("Я пингвин № " + kot);
    }
    public void draw(Graphics w){
        w.fillOval(x+30,y+30,Size,Size);
        w.setColor(Color.yellow);
        w.fillOval(x+35,y+35,Size-15,Size-15);

    }
}
