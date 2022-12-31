package ru.gb;

import ru.gb.ManagerData.ManagerData;

/**
 * Итоговый проект
 *
 */
public class App
{

    public static void main( String[] args )
    {
        try{
            ValidData data = new ValidData();
            ManagerData managerData = new ManagerData();
            managerData.saveToFile(data.getLastName(), data.getFormData());
//            System.out.println(data.getFormData());
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
