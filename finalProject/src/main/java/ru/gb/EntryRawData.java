package ru.gb;

import ru.gb.Exceptions.CodeError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EntryRawData {
    protected  ArrayList<String> dataRaws;

    public EntryRawData(){
        dataRaws = new ArrayList<>();
    }

    protected void entryRawData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные о человеке через пробел:");
        String[] dataArray = scanner.nextLine().split(" ");
        dataRaws.addAll(Arrays.asList(dataArray));

        if (CodeError.checkingCode(validLenghtData())) {
            dataRaws.clear();
            entryRawData();
        }
        scanner.close();
    }

    private  int validLenghtData() {
        if (dataRaws.size() < 6){
            dataRaws.clear();
            return -1;
        }
        if (dataRaws.size() > 6){
            dataRaws.clear();
            return -2;
        }
        return 0;
    }
}