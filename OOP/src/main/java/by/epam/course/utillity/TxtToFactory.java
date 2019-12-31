package by.epam.course.utillity;

import by.epam.course.entity.SweetType;
import by.epam.course.factory.SweetFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Класс предназначен для считывания данных из файла и передачи их на фабрику
 */
public class TxtToFactory {

    /**
     * Метод для считывания из файла и передачи данных на фабрику
     */
    public static void createNewSweets() {
        sendToFactory(readTxtFile());
    }

    /**
     * Метод для считывания данных из файла
     *
     * @return - возвращает коллекцию, содержащую считанные строки
     */
    private static List<String> readTxtFile() {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("src\\main\\resources", "Sww.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
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

    /**
     * Метод принимает строку, парсит её на составляющие и передает на фабрику
     *
     * @param lines - коллекция строк, считанных из файла
     */
    private static void sendToFactory(List<String> lines) {
        SweetFactory factory = new SweetFactory();
        List<String> params;
        // Номер строки
        int stringNumber = 1;


        // Перебираем строки из файла
        for (String s : lines) {
/*            int i = lines.indexOf(s);     - Не используется, т.к. при повторении нулевых строк выдает индекс
            первой пустой строки*/
            params = splitLine(s);

            params = Validator.checkData(params, stringNumber);

            if (params.size() > 4) {
                factory.createTypeSweets(stringNumber, SweetType.valueOf(params.get(0)), params.get(1),
                        Float.parseFloat(params.get(2)), Float.parseFloat(params.get(3)), params.get(4));
            }
            // Инкремент номера строки
            stringNumber++;
        }
    }


    /**
     * Метод для парсинга строки по ";" и записи каждого элемента в коллекцию строк
     *
     * @param line - строка
     * @return - коллекция строк
     */
    //
    private static List<String> splitLine(String line) {
        StringTokenizer stt = new StringTokenizer(line, ";");
        List<String> allParam = new ArrayList<>();

        while (stt.hasMoreTokens()) {
            String str = stt.nextToken();
            allParam.add(str);
        }
        return allParam;
    }

}
