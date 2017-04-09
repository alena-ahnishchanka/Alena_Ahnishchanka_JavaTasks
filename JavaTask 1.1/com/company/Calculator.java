package com.company;

/**
 * Created by Alena_Ahnishchanka on 2/13/2017.
 */
public class Calculator {

    double result;
    double a;   //первое число
    double b;   //второе число
    String op;  //тип операции ("+" либо "-" либо "*" либо "/")

    // конструктор
    public Calculator(double a, String op, double b) {
        this.a = a;
        this.op = op;
        this.b = b;
    }

    // геттеры / сеттеры
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    //вывод первоначальных данных
    public void initial() {
        System.out.println("The 1st number: " + a);
        System.out.println("Operation type: " + op);
        System.out.println("The 2nd number: " + b);
        System.out.println();
    }

    //вывод результата
    public void finalResult() {
        if (op == "+") {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
            System.out.println();
        } else {
            if (op == "-") {
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                System.out.println();
            } else {
                if (op == "*") {
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    System.out.println();
                } else {
                    if (op == "/") {
                        result = a / b;
                        System.out.println(a + " / " + b + " = " + result);
                        System.out.println();
                    } else {
                        if (op != "+" || op != "-" || op != "*" || op != "/")
                            System.out.println("Please enter correct operation type (+ - * /)");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                }
            }
        }
    }

}
