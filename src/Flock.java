import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Flock {
    private ArrayList<Bird> flock;
    public void draw (Graphics g){
        for(int i = 0; i<flock.size();i++){
            flock.get(i).draw(g);
        }
    }
    public void fly(){
        for (int i = 0; i < flock.size(); i++) {
            flock.get(i).fly();
        }
    }
    public Flock(int n){
        flock=new ArrayList<Bird>(n);
        Scanner s=new Scanner(System.in);
        System.out.println("1 - name Macow, 2 - name Penguin, 3 - Sparrow, 4 - exit");
        for (int p=0; ;p++ ){
            System.out.println("1 or 2 or 3 or 4");
            p = s.nextInt();
            if (p==1) {
                flock.add(new Macaw(ID.nameMacaw.id[(int)(( Math.random() * (5 - 0 + 1) + 0))]));
            }
            if (p==2) {
                flock.add(new Penguin((ID.namePenguin.id[(int)(( Math.random() * (5 - 0 + 1) + 0))])));
            }
            if (p==3){
                flock.add(new Sparrow((ID.nameSparrow.id[(int)(( Math.random() * (5 - 0 + 1) + 0))])));
            }
            if (p==4){
                break;
            }
        }
    }
}
