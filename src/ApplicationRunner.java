import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
        }

        ArrayList<Object> toBeFiltered  = new ArrayList<>();
        Filter ShortWordFilter = new ShortWordFilter();
        Filter MediumWordFilter = new MediumWordFilter();
        Filter LongWordFilter = new LongWordFilter();

        while (in.hasNext()) {
            toBeFiltered.add(in.next());
        }

        ArrayList<Object> shortWords = Filter.applyFilter(toBeFiltered, ShortWordFilter);
        ArrayList<Object> mediumWords = Filter.applyFilter(toBeFiltered, MediumWordFilter);
        ArrayList<Object> longWords = Filter.applyFilter(toBeFiltered, LongWordFilter);

        System.out.println("Short Words\n====================");
        for (Object word : shortWords) {
            System.out.println(word);
        }

        System.out.println("\n");

        System.out.println("Medium Words\n====================");
        for (Object word : mediumWords) {
            System.out.println(word);
        }

        System.out.println("\n");

        System.out.println("Long Words\n====================");
        for (Object word : longWords) {
            System.out.println(word);
        }
    }
}