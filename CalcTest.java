import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.summer.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    void addition(){
        String actual = Main.calculate("1", "+", "1");
        assertEquals("2.0", actual);
    }

    @Test
    void substraction(){
        String actual = Main.calculate("2", "-", "4");
        assertEquals("-2.0", actual);
    }

    @Test
    void multiplication(){
        String actual = Main.calculate("50", "*", "2");
        assertEquals("100.0", actual);
    }

    @Test
    void division(){
        String actual = Main.calculate("10", "/", "2");
        assertEquals("5.0", actual);
    }

    @Test
    void division_by_null(){
        String actual = Main.calculate("10", "/", "0");
        assertEquals("Деление на ноль!", actual);
    }
}
