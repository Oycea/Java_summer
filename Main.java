package ru.ac.uniyar.mf.summer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String f_num, s_num, operator;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите выражение: ");

        f_num = in.next();
        operator = in.next();
        s_num = in.next();

        String answer = calculate(f_num, operator, s_num);
        System.out.println(answer);
    }

    public static String calculate(String fnum, String operation, String snum) {
        double num1 = Double.parseDouble(fnum);
        double num2 = Double.parseDouble(snum);
        switch (operation) {
            case "+":
               return Double.toString(num1 + num2);
            case "-":
                return Double.toString(num1 - num2);
            case "*":
                return Double.toString(num1 * num2);
            case "/":
                if (num2 == 0) {
                    return "Деление на ноль!";
                }
                else {
                    return Double.toString(num1 / num2);
                }
            default:
                return "Nothing";
        }
    }
}
