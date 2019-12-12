import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
      /* Bird a = new Bird();
       a.fly();
       Macaw b = new Macaw(" Путин");
       b.fly();
       Macaw c = new Macaw();
       c.fly();
       b.speak();
       c.speak();
       c.speak();
       System.out.println(c.getName());

       c.setName("Трамп");
       c.speak();
       Penguin d = new Penguin();
       d.fly();
       b.hello(c);
        Bird[] a = new Bird[3];
        a[0] = new Macaw("George");
        a[1] = new Penguin();
        a[2] = new Macaw("Petr 1");
        for(int i = 0; i < a.length; i++){
            a[i].fly();
        }*/
        Flock f1 = new Flock(1);
        MyWindow w = new MyWindow(f1);

    }
}
