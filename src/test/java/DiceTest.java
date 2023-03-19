import objects.Dice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest
{
    private Dice dice;


    @Test
    public void testColor()
    {
        dice = new Dice(6, "red");
        assertEquals("red", dice.getColor());
    }

    @Test
    public void testSides()
    {
        dice = new Dice(6, "red");
        assertEquals(6, dice.getSides());
    }

    @Test
    public void testRoll() {
        dice = new Dice(6, "red");
        int result = dice.roll();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void testRollTimes()
    {
        dice = new Dice(6, "red");
        int[] results = dice.rollMany(6);
        assertEquals(6, results.length);

    }

}
