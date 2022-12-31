package ru.gb;

import ru.gb.Exceptions.*;
import ru.gb.Parsing.ParsingData;
import java.util.ArrayList;

public class ValidData extends ParsingData {
    private final ArrayList<Object> formData;

    {
        formData = new ArrayList<>();
    }

    public ValidData() throws RuntimeException {
        entryRawData();
        checkException();
    }

    public void checkException() throws RuntimeException
                                        {
        Object tmp;

        tmp = parsingLastName();
        if (tmp == null)
            throw new NotCorrentLastName("Вы ввели не правильную фамилию");
        formData.add(tmp);

        tmp = parsingMiddleName();
        if (tmp == null)
            throw new NotCorrentMiddleName("Вы ввели не правильное отчество");
        formData.add(tmp);

        tmp = parsingBirthday();
        if (tmp == null)
            throw new NotCorrentBirthday("Вы ввели не правильную дату рождения");
        formData.add(tmp);

        tmp = parsingNumberPhone();
        if (tmp == null)
            throw new NotCorrentNumberPhone("Вы ввели не правильный номер телефона");
        formData.add(tmp);

        tmp = parsingGender();
        if (tmp == null)
            throw new NotCorrentGender("Вы ввели не правильный пол");
        formData.add(tmp);

        tmp = parsingName();
        if (tmp == null)
            throw new NotCorrentName("Вы ввели не правильное имя");
        formData.add(1, tmp);

    }

    public ArrayList<Object> getFormData() {
        return formData;
    }

    public String getLastName() {
        return formData.get(0).toString();
    }
}