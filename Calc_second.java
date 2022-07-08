package ru.ac.uniyar.mf.summer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, num;
        int num_operations;
        List<String> all_ex = new ArrayList<String>();

        num = in.nextLine();
        num_operations = Integer.parseInt(num);
        for (int i = 0; i < num_operations; i++) {
            System.out.println("Введите выражение: ");
            str = in.nextLine();
            all_ex.add(str);
        }

        for (int i = 0; i < num_operations; i++) {
            String[] parts = all_ex.get(i).split(" ");
            System.out.println((i + 1) + ") " + calculate(parts[0], parts[1], parts[2]));
        }
    }

    public static Fraction create_Fraction(String fraction) {
        String[] data = fraction.split("/");
        if (data.length == 1) {
            return new Fraction(Integer.parseInt(data[0]));
        }
        return new Fraction(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
    }

    public static String calculate(String fnum, String operation, String snum) {
        Fraction num1 = create_Fraction(fnum);
        Fraction num2 = create_Fraction(snum);

        if(num1.denomin_is_zero()){
            return "Знаменатель первой дроби равен нулю!";
        }
        if(num2.denomin_is_zero()){
            return "Знаменатель второй дроби равен нулю!";
        }

        switch (operation) {
            case "+":
                return num1.sum(num2).toString();
            case "-":
                return num1.subtraction(num2).toString();
            case "*":
                return num1.multiplication(num2).toString();
            case "/":
                if (num2.is_zero() == true) {
                    return "Деление на ноль!";
                }
                else {
                    return num1.division(num2).toString();
                }
            default:
                return "Неверная операция!";
        }
    }
}
