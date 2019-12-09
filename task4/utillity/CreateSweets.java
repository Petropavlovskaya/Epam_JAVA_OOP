package by.epam.petropavlovskaya.task4.utillity;

import by.epam.petropavlovskaya.task4.Sweets.*;
import by.epam.petropavlovskaya.task4.Factory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CreateSweets {
//    private

    public static void createNewSweets(List<String> lines) {
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
}
