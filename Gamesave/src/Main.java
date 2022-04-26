import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        File savegames = new File(GameProgress.savingDirectory);
         savegames.mkdir();
        GameProgress  save1 = new GameProgress("save1", 8, 4, 3, 32.5);
        GameProgress  save2 = new GameProgress("save2",6, 5, 4, 45.8);
        GameProgress  save3 = new GameProgress("save3", 5, 7, 5, 46.7);
        for(int i = 0; i < GameProgress.GPList.size(); i ++){
            saveGame( GameProgress.savingDirectory + "/" + GameProgress.GPList.get(i).getId(), GameProgress.GPList.get(i));
        }
        System.out.println(GameProgress.GPList.get(1).toString());
    }
    public static void saveGame(String path, GameProgress save){
//        try {
//             save.save.createNewFile();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        try (FileOutputStream fos = new FileOutputStream(new File(path));
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            //запишемэкземплярклассавфайл
            oos.writeObject(save);} catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
//     public void zipFile(String zipPath, ArrayList<String> pathList){
//        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipPath)))
//         {
//             for(int i =0; i < pathList.size(); i ++){
//             try(FileInputStream fis = new FileInputStream(pathList.get(i)){
//                 ZipEntry entry = new ZipEntry("packed_saveGame" + (i +1));
//                 zout.putNextEntry(entry);
//                 byte[] buffer = new byte[fis.available()];
//                 fis.read(buffer);
//                 zout.write(buffer);
//                 zout.closeEntry();
//             }catch (Exception ex){
//                 System.out.println(ex.getMessage());
//             }
//         }
//
//         }catch (Exception ex){
//            System.out.println(ex.getMessage());
//
//     }
//    }
}
