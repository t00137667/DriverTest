import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver jeff = new Driver("Jeff", 113);

    @Test
    public void testGetDriverName(){
        assertEquals("Jeff", jeff.getDriverName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetDriverNameFail(){
        Driver bob = new Driver("", 114);
        bob.getDriverName();
    }

    @Test
    public void testGetDriverNum(){
        assertEquals(113, jeff.getDriverNum());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetDriverNumFail(){
        Driver chuck = new Driver("Chuck", 50);
        chuck.getDriverNum();
    }

    @Test
    public void testIfNotBanned(){
        assertFalse(jeff.check_status());
    }

    @Test (timeout = 1000)
    public void testWaitTilBanned(){
        jeff.waitTillbanned();
    }

    @Test
    public void testToString(){
        assertEquals("\nDriver Name: Jeff\nDriver Number: 113", jeff.toString());
    }


}