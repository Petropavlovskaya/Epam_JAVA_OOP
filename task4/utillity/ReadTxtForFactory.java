package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Factory.SweetsFactory;
import by.epam.petropavlovskaya.task4.Factory.SweetsType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadTxtForFactory {

    private static List<String> readTxtFile() {
        List<String> lines = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("D://Sweets1.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            if (lines.isEmpty()) {
                throw new NullPointerException();
            }
        } catch (NullPointerException ex) {
            System.out.println("Файл пуст.");
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }

    private static void createNewSweets(List<String> lines) {
        SweetsFactory factory = new SweetsFactory();

        try {
            // perebiraem stroki w faile
            for (String s : lines) {
                // razbivaem stroku i zapisyvaem ee elementy v List<String> eachLine
                StringTokenizer stt = new StringTokenizer(s, ";");
                List<String> eachLine = new ArrayList<String>();
                while (stt.hasMoreTokens()) {
                    eachLine.add(stt.nextToken());
                }
                try {
                    factory.createTypeSweets(SweetsType.valueOf(eachLine.get(0)), eachLine.get(1),
                            Float.parseFloat(eachLine.get(2)), Float.parseFloat(eachLine.get(3)), eachLine.get(4));

                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                } catch (IndexOutOfBoundsException ex) {
                    System.out.println("Nie dostatochno parametrov dla sozdaniya ekzemplara " + ex.getMessage());
                } catch (IllegalArgumentException ex) {
                    System.out.println("Nie pravilnyj parametr dla sozdaniya ekzemplara " + ex.getMessage());
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readDataForFactory() {
        createNewSweets(readTxtFile());
    }
}
