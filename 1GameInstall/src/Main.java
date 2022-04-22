import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static <IOExceptionex> void main(String[] args) {
        StringBuilder report = new StringBuilder();
        File src = new File("C:\\Users\\888\\Desktop\\Vano\\Coding\\Netology\\JavaCore\\HW3\\Games\\src");
        if (src.mkdir()) {
            report.append("Каталог src создан");
            report.append("\n");
        }
        File res = new File("C:\\Users\\888\\Desktop\\Vano\\Coding\\Netology\\JavaCore\\HW3\\Games\\res");
        if (res.mkdir()) {
            report.append("Каталог res создан");
            report.append("\n");
        }
        File savegames = new File("C:\\Users\\888\\Desktop\\Vano\\Coding\\Netology\\JavaCore\\HW3\\Games\\savegames");
        if (savegames.mkdir()) {
            report.append("Каталог savegames создан");
            report.append("\n");
        }
        File temp = new File("C:\\Users\\888\\Desktop\\Vano\\Coding\\Netology\\JavaCore\\HW3\\Games\\temp");
        if (temp.mkdir()) {
            report.append("Каталог temp создан");
            report.append("\n");

        }
        File main = new File(src, "main");
        if (main.mkdir()) {
            report.append("Каталог main создан");
            report.append("\n");
        }
        File test = new File(src, "test");
        if (test.mkdir()) {
            report.append("Каталог test создан");
            report.append("\n");
        }

        File Main = new File(main, "Main.java");
        try {
            if (Main.createNewFile()) {
                report.append("Файл Main.java создан");
                report.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File Utils = new File(main, "Utils.java");
        try {
            if (Utils.createNewFile()) {
                report.append("Файл Utils.java создан");
                report.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File drawable = new File(res, "drawable");
        if (drawable.mkdir()) {
            report.append("Каталог drawable создан");
            report.append("\n");
        }

        File vector = new File(res, "vector");
        if (vector.mkdir()) {
            report.append("Каталог vector создан");
            report.append("\n");
        }

        File icon = new File(res, "icon");
        if (icon.mkdir()) {
            report.append("Каталог icon создан");
            report.append("\n");

        }

        File temptxt = new File(temp, "temp.txt");
        try {
            if (temptxt.createNewFile()) {
                report.append("Файл temp.txt создан");
                report.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String reports = report.toString();
        try (FileWriter reporter = new FileWriter(temptxt)) {
            reporter.write(reports);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
