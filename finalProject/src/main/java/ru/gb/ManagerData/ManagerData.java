package ru.gb.ManagerData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * управляет данными
 */
public class ManagerData implements SaveFile{

    @Override
    public void saveToFile(String nameFile, ArrayList<Object> dataPerson) {
        nameFile = String.format("%s.txt", nameFile);
        try (FileWriter writer = new FileWriter(nameFile, true)) {
            for (Object item : dataPerson) {
                writer.write(item.toString());
                writer.append(' ');
            }
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}