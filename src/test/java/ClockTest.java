import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClockTest {
    
    @Test
    public void isMorningTest1() {
        Clock clock = new Clock("05:00:00");
        assertTrue(clock.isMorning());
    }
    @Test
    public void isMorningTest2() {
        Clock clock = new Clock("11:59:59");
        assertTrue(clock.isMorning());
    }
    @Test
    public void isAfternoonTest1() {
        Clock clock = new Clock("12:00:00");
        assertTrue(clock.isAfternoon());
    }
    @Test
    public void isAfternoonTest2() {
        Clock clock = new Clock("17:59:59");
        assertTrue(clock.isAfternoon());
    }
    @Test
    public void isNightTest1() {
        Clock clock = new Clock("18:00:00");
        assertTrue(clock.isNight());
    }
    @Test
    public void isNightTest2() {
        Clock clock = new Clock("23:59:59");
        assertTrue(clock.isNight());
    }
    @Test
    public void isNightTest3() {
        Clock clock = new Clock("00:00:00");
        assertTrue(clock.isNight());
    }
    @Test
    public void isNightTest4() {
        Clock clock = new Clock("04:59:59");
        assertTrue(clock.isNight());
    }
}
