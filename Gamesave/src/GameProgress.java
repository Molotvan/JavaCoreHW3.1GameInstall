import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;
    public static String savingDirectory = "C:\\Users\\Hewlett Packard\\Desktop\\Coding\\Netology\\Java Core\\HW3\\GameInstall\\JavaCoreHW3.1GameInstall\\Games\\savegames";
    private int health;
    private int weapons;
    private int lvl;
    private double distance;
    private String id;
    public static List<String> pathList = new ArrayList<String>();
    public static List<GameProgress> GPList = new ArrayList<GameProgress>();
    //public File save;

    public GameProgress(  String id, int health, int weapons, int lvl, double distance) {
        //this.save = save;
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
        pathList.add(savingDirectory + "//" + id);
        GPList.add (this);//(new GameProgress(save, id, health, weapons, lvl, distance));
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
    public String getId(){
        return this.id;
    }
}
