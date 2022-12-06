package ru.gb;

import java.util.ArrayList;
import java.util.logging.Logger;

import ru.gb.Exception.DivisionByZeroException;
import ru.gb.models.Complex;
import ru.gb.models.PerformanceNumber;
import ru.gb.models.Rational;
import ru.gb.inputs.InputComplex;
import ru.gb.inputs.InputRational;
import ru.gb.inputs.InputItemMenu;
import ru.gb.view.OperationMenu;
import ru.gb.view.RationalOrComplexMenu;
import ru.gb.view.ViewResult;

public class Controller {
    private static final Logger logger = Logger.getGlobal();
    RationalOrComplexMenu rationalOrComplexMenu;
    InputItemMenu itemMenu;
    InputComplex inputComplex;
    InputRational inputRational;
    OperationMenu operationMenu;
    PerformanceNumber<Object> number;
    ArrayList<PerformanceNumber<Object>> numbers;

    public Controller() {
        this.rationalOrComplexMenu = new RationalOrComplexMenu();
        this.operationMenu = new OperationMenu();
        this.itemMenu = new InputItemMenu();
        this.inputComplex = new InputComplex();
        this.inputRational = new InputRational();
    }

    public void run() {
            rationalOrComplexMenu.show();
            itemMenu.entry();

        while (itemMenu.get() != 0) {
            numbers = new ArrayList<>();
            choiceViewCalculatorAndEntryNumbers(itemMenu.get());
            operationMenu.show();
            itemMenu.entry();
            choiceOperationWithNumbers(itemMenu.get());
            rationalOrComplexMenu.show();
            itemMenu.entry();
        }
    }

    private void choiceViewCalculatorAndEntryNumbers(int item) {
        int n = 2;
        switch (item) {
            case 1 -> {
                for(int i = 0; i < n; i++) {
                    inputRational.entry();
                    number = (PerformanceNumber) (new Rational(inputRational.getNumber()));
                    numbers.add(number);
                }
            }
            case 2 -> {
                for(int i = 0; i < n; i++) {
                    inputComplex.entry();
                    number = (PerformanceNumber) (new Complex(inputComplex.getReal(), inputComplex.getImaginary()));
                    numbers.add(number);
                }
            }
        }
    }

    private void choiceOperationWithNumbers(int item) {
        switch (item) {
            case 1 -> ViewResult.show(numbers.get(0).add(numbers.get(1)));
            case 2 -> ViewResult.show(numbers.get(0).sub(numbers.get(1)));
            case 3 -> ViewResult.show(numbers.get(0).mul(numbers.get(1)));
            case 4 -> {
                try{
                ViewResult.show(numbers.get(0).div(numbers.get(1)));
                } catch (DivisionByZeroException e) {
                    System.out.println(e);
                }
            }
        }
//        System.out.println(numbers.get(0).add(numbers.get(1)));


    }
}