package by.epam.course.utillity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ValidatorTest {

    @Test
    void checkData() {
        List<String> inList;
        String[] outArray;
        String[] bar1 = {"CHOCO+LATE_BAR", "Ярч*е", "38.3", "20", " \tSMALL"};
        String[] bar2 = {"CHOCO L A T E _BAR", "Ярче", "     38.3", "20", " SMALL"};
        String[] bar22 = {"CHOCOLATE_BAR", "Ярче", "38.3", "20", "SMALL"};
        String[] candy1 = {" CHOCOLATE_CANDY ", "Аленка", "     5.3", "\t44", " true"};
        String[] candy2 = {"CHOCOLATE_CANDY", "Аленка", "5.3", "44", "true"};
        String[] lollipop1 = {" L O L L I P O P ", "\tЧупа-чупс\t", "\t 14.73  ", "54.1", " true"};
        String[] lollipop11 = {"LOLLIPOP", "Чупа-чупс", "14.73", "54.1", "true"};
        String[] lollipop2 = {" L O L L I P O P ", "Чупа-чупс", "\t s  ", "54.1", " true"};

        outArray = new String[]{};
        inList = Arrays.asList(bar1);
        assertArrayEquals(outArray, Validator.checkData(inList, 1).toArray());
        inList = Arrays.asList(bar2);
        assertArrayEquals(bar22, Validator.checkData(inList, 1).toArray());
        inList = Arrays.asList(candy1);
        assertArrayEquals(candy2, Validator.checkData(inList, 1).toArray());
        inList = Arrays.asList(lollipop1);
        assertArrayEquals(lollipop11, Validator.checkData(inList, 1).toArray());
        outArray = new String[]{"LOLLIPOP", "Чупа-чупс"};
        inList = Arrays.asList(lollipop2);
        assertArrayEquals(outArray, Validator.checkData(inList, 1).toArray());
    }
}