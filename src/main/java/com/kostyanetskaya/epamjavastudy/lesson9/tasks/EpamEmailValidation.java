package com.kostyanetskaya.epamjavastudy.lesson9.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {

    /*
    Реализуйте метод validateEpamEmail в EpamEmailValidation.
    Этот метод проверяет входную строку на соответствие правилам для обычного электронного адреса EPAM. Определим их:
    Стандартный электронный адрес в EPAM включает имя и фамилию (на английском языке), разделенные знаком подчеркивания("_").
    Электронные адреса EPAM всегда заканчиваются на "@epam.com".
    Если человек получает новый электронный адрес в EPAM, а адрес с таким именем и фамилией уже зарегистрирован,
    необходимо добавить "1" к новому электронному адресу.
    Если такой адрес электронной почты так же уже существует, используйте "2" и так далее.
     */
    public static boolean validateEpamEmail(String email) {

        if (email == null) {
            return false;
        }
        Pattern p1 = Pattern.compile("[a-z]+_[a-z]+@epam.com");
        Pattern p2 = Pattern.compile("[a-z]+_[a-z]+\\d@epam.com");
        Matcher m = p1.matcher(email);
        Matcher m2 = p2.matcher(email);

        if (m.matches() || m2.matches()) {
            return true;
        }
        return false;
    }
}
