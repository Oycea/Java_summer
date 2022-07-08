ackage ru.ac.uniyar.mf.summer;

public class Fraction {
    private int numerator;
    private int denominator;

    // КОНСТРУКТОРЫ

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numer, int denomin) {
        this.numerator = numer;
        this.denominator = denomin;
    }

    public Fraction(int number) {
        this.numerator = number;
        this.denominator = 1;
    }

    // ГЕТТЕРЫ

    public int get_numerator(){
        return numerator;
    }
    public int get_denominator(){
        return denominator;
    }

    // МЕТОДЫ

    // Сумма двух дробей
    public Fraction sum(Fraction obj) {
        return new Fraction(numerator * obj.denominator + obj.numerator * denominator,
                denominator * obj.denominator);
    }
    // Разность двух дробей
    public Fraction subtraction(Fraction obj) {
        return new Fraction(numerator * obj.denominator - obj.numerator * denominator,
                denominator * obj.denominator);
    }
    // Умножение двух дробей
    public Fraction multiplication(Fraction obj) {
        return new Fraction(numerator * obj.numerator, denominator * obj.denominator);
    }
    // Деление двух дробей
    public Fraction division(Fraction obj) {
        return new Fraction(numerator * obj.denominator, denominator * obj.numerator);
    }
    // Проверка: является ли знаменатель нулём
    public boolean denomin_is_zero() {
        if(denominator == 0){
            return true;
        }
        return false;
    }
    // Проверка: яляется ли чилсо нулём
    public boolean is_zero() {
        if(numerator == 0 || denominator == 0){
            return true;
        }
        return false;
    }
    // Проверка: является ли число целым
    public boolean is_integer() {
        if(denominator == 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if(denominator == 1){
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }
}
