package lv.rvt;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Money;

public class MoneyTest {

    @Test
    public void PlusMethod() {
        Money mon1 = new Money(5, 10);
        Money mon2 = new Money(5, 10);

        Money result1 = mon1.plus(mon2);

        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());

        Money mon3 = new Money(2, 89);
        Money mon4 = new Money(3, 99);

        Money result2 = mon3.plus(mon4);

        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());
    }

    @Test
    public void LessThanMethod() {
        
        Money mon1 = new Money(10, 0);
        Money mon2 = new Money(3, 0);
        Money mon3 = new Money(5, 0);

        assertEquals(false, mon1.lessThan(mon2));
        assertEquals(true, mon2.lessThan(mon3));
    }

    @Test
    public void MinusMethod() {
        Money mon1 = new Money(2, 80);
        Money mon2 = new Money(1, 90);

        Money result1 = mon1.minus(mon2);

        assertEquals(0, result1.euros());
        assertEquals(90, result1.cents());
    }
}