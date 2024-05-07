package p3;
import java.util.Random;
public class producer implements Runnable{
    private jornal j;
    private String name;
    private int[] groups;
    private int lector;
    public producer(jornal j, String who, int lector, int[] g){
        this.j=j;
        name = who;
        groups = g;
        this.lector=lector;
    }
    public void run () {
        Random random = new Random();
        for (int g : groups){
            for(int stud=0; stud<20; stud ++){
                for(int w=0; w<12; w++) {
                    j.put(g, stud, w, lector, random.nextInt(100) + " (" + name+ ");");
                }
            }
        }
    }
}
