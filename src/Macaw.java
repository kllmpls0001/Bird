import java.awt.*;

public class Macaw extends Bird {
    private static String name;
    private static int kit = 0;
    public Macaw(String name){
        x = 20;
        y = 20;
        color = Color.green;
        Size = 9;
        this.name = name;
        System.out.println("Я попугай "+ name +"!");
        kit++;
        System.out.println("Я попугай № " + kit);
    } /*
    public void speak(){
        System.out.println("Меня зовут " + this.name + "!");
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hello(Macaw m){
        System.out.println("Привет, " + m.getName() + "! Меня зовут " + name + ".");
    }
    */
}
