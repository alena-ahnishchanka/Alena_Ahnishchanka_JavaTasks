package com.company;

/**
 * Created by Alena_Ahnishchanka on 2/13/2017.
 */
public class CalculatorTest {
    public static void main(String[] args) {
// 1-ая попытка
        Calculator calculator = new Calculator(10,"", 5000);

        calculator.initial();
        calculator.finalResult();

// 2-ая попытка
        calculator.setA(-1);
        calculator.setOp("+");
        calculator.setB(6);

        calculator.initial();
        calculator.finalResult();
    }
}
