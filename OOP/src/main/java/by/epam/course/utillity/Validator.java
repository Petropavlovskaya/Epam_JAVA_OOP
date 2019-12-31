package by.epam.course.utillity;

import by.epam.course.entity.BarSize;
import by.epam.course.entity.SweetType;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Класс "Валидатор" для проверки считанных значений перед созданием объекта
 */
class Validator {

    /**
     * Метод проверки валидности значений для создания экземпляра класса.
     * Подразумевается правильный порядок записи параметров в строках
     *
     * @param allParam     - коллекция параметров для созданияобъекта
     * @param stringNumber - номер строки, из которой считаны параметры
     * @return - коллекция валидных рараметров
     */
    /* Принимает строку (и ее порядковый номер), содержащую параметры
     */
    static List<String> checkData(List<String> allParam, int stringNumber) {
        // Содержит валидные параметры создаваемого объекта
        List<String> validParam = new ArrayList<>();
        String param = "";
        Pattern pattern = Pattern.compile("^[А-Я]+[а-я]+((-)?|(\\s)?)([а-яА-Я]+|[0-9]+)$");
        Matcher matcher;

        try {
            // Проверяем наличие всех параметров
            if (allParam.size() < 5) {
                throw new IndexOutOfBoundsException();
            }

            allParam = cleaString(allParam);

            // Проверка первого параметра "Тип сладости" на его наличие в перечислении
            param = allParam.get(0);
            if (param.equals(SweetType.CHOCOLATE_BAR.name()) ||
                    param.equals(SweetType.CHOCOLATE_CANDY.name()) ||
                    param.equals(SweetType.LOLLIPOP.name())) {
                validParam.add(param);
            } else {
                throw new IllegalArgumentException(param);
            }

            /* Для наименования сладости удаляем пробелы только в начале и в конце строки,
               т.к. наименование может состоять из двух и более слов
            */
            param = allParam.get(1);
            matcher = pattern.matcher(param);
            // Записываем второй параметр
            if (matcher.matches()) {
                validParam.add(param);
            } else {
                throw new Exception("\"наименование\"");
            }

            param = allParam.get(2);
            if (Float.parseFloat(param) > 1) {
                validParam.add(param);
            } else {
                throw new Exception("\"вес\"");
            }

            param = allParam.get(3);
            if (Float.parseFloat(param) > 1) {
                validParam.add(param);
            } else {
                throw new Exception("\"количество сахара\"");
            }

            // Проверка последнего параметра на его наличие в перечислении либо на тип boolean
            param = allParam.get(4);
            if (param.equals(BarSize.SMALL.name()) || param.equals(BarSize.MEDIUM.name()) ||
                    param.equals(BarSize.LARGE.name()) || param.equals(BarSize.EXTRA_LARGE.name()) ||
                    param.equals("true") || param.equals("false")) {
                validParam.add(param);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (
                NumberFormatException ex) {
            System.out.println("Строка № " + stringNumber + ". Ошибка. Неверный формат \"" + ex.getMessage() +
                    "\" для одного из параметров. ");
        } catch (
                IndexOutOfBoundsException ex) {
            System.out.println("Строка № " + stringNumber + ". Ошибка. Недостаточное количество параметров. Объект не создан.");
        } catch (
                IllegalArgumentException ex) {
            System.out.println("Строка № " + stringNumber + ". Ошибка. Некорректный параметр \"" + ex.getMessage() +
                    "\". ");
        } catch (
                Exception ex) {
            System.out.println("Строка № " + stringNumber + ". Ошибка. Невозможно создать " + ex.getMessage() +
                    " со значением: " + param + ". ");
        }
        return validParam;
    }

    /**
     * Метод для удаления из строки табуляций
     *
     * @param str - строка
     * @return - строка без табуляций
     */
    private static String deleteTab(String str) {
        return str.replaceAll("\t", "");
    }

    /**
     * Метод для удаления из строки пробелов
     *
     * @param str - строка
     * @return - строка без пробелов
     */
    private static String deleteSpace(String str) {
        return str.replaceAll(" ", "");
    }

    /**
     * Метод для удаления пустых символов в начале и в конце строки
     *
     * @param str - строка
     * @return - строка без табуляций
     */
    private static String doTrim(String str) {
        return str.trim();
    }

    /**
     * Метод для удаления пробелов и табуляций в зависимости от параметра.
     *
     * @param allParam - коллекция считанных параметров
     * @return - коллекция отформатированных параметров
     */
    // Удаляем пробелы и табуляцию для всех параметров, кроме параметра "Наименование" (индекс 1)
    private static List<String> cleaString(List<String> allParam) {
        List<String> cleanString = new ArrayList<>();
        for (int i = 0; i < allParam.size(); i++) {
            String str = allParam.get(i);
            if (i != 1) {
                str = deleteTab(str);
                str = deleteSpace(str);
            }
            str = doTrim(str);
            cleanString.add(str);
        }
        return cleanString;

    }
}
