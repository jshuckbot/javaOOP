package ru.gb.Parsing;

import ru.gb.EntryRawData;

/**
 * Отвечает за парсинг данных о челевека
 */
public class ParsingData extends EntryRawData implements
    ParsingName, ParsingMiddleName,
    ParsingLastName, ParsingBirthday,
    ParsingNumberPhone, ParsingGender {
    private final String[] endLastNames = {
        "кий", "ов", "ова", "ев", "ева","ин",
        "ина", "ук", "кая",
        "ын", "ына", "ой", "ая", "ых", "их"
    };
    private final String[] endMiddleNames = {"ович", "овна", "евич", "евна", "ич", "ична"};

    public ParsingData() {
    }

    @Override
    public String parsingLastName() {
        for (String suffix : endLastNames)
            for (String item : dataRaws){
                if (item.endsWith(suffix)){
                    dataRaws.remove(item);
                    return item;
                }
        }
        return null;
    }

    @Override
    public String parsingMiddleName() {
        for (String suffix : endMiddleNames)
            for (String item : dataRaws){
                if (item.endsWith(suffix)) {
                    dataRaws.remove(item);
                    return item;
                }
            }
        return null;
    }

    @Override
    public String parsingBirthday() {
        for (String item : dataRaws)
            if(isCheckCorrentFormatDate(item) && isFormatDate(item)){
                dataRaws.remove(item);
                return item;

        }
        return null;
    }
    private boolean isCheckCorrentFormatDate(String date) {
        long count = date.chars().filter(ch -> ch == '.').count();
        return count == 2;
    }
    private boolean isFormatDate(String date) {
        String day;
        String mounth;
        String year;

        String[] ddate = date.split("\\.");
        day = ddate[0];
        mounth = ddate[1];
        year = ddate[2];

        return day.length() == 2 && mounth.length() == 2 && year.length() == 4;
    }

    @Override
    public Character parsingGender() {
        for (String item : dataRaws)
            if(item.length() == 1){
                dataRaws.remove(item);
                return item.charAt(0);
            }
        return null;
    }


    @Override
    public String parsingName() {
        if (dataRaws.get(0).length() > 2)
            return dataRaws.get(0);
        return null;
    }

    @Override
    public Long parsingNumberPhone() {
        for (String item : dataRaws)
            try {
                Long.parseLong(item);
                dataRaws.remove(item);

                if (item.length() != 10) return null;

                return Long.parseLong(item);

            } catch(NumberFormatException e){
                continue;
            }
        return null;
    }
}