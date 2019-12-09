package by.epam.petropavlovskaya.task4.utillity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TxtFileReader {

    public static List<String> readTxtFile() {
        List<String> lines = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("D://Sweets1.txt")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            if (lines.isEmpty()){
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
}
