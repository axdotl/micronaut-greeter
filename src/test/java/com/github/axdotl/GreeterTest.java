package com.github.axdotl;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GreeterTest {

    @Test
    public void sayGoodMorningWhenItIsBefore12pm() {
        String message = Greeter.getAppropriateWelcomeMessage(LocalTime.of(11,59));
        assertNotNull(message);
        assertEquals("Good Morning", message);
    }

    @Test
    public void sayGoodAfternoonWhenItIsAfter12pmButBefore6pm() {
        String message = Greeter.getAppropriateWelcomeMessage(LocalTime.of(17,59));
        assertNotNull(message);
        assertEquals("Good Afternoon", message);
    }

    @Test
    public void sayGoodNightWhenItIsAfter6pm() {
        String message = Greeter.getAppropriateWelcomeMessage(LocalTime.of(18,01));
        assertNotNull(message);
        assertEquals("Good Night", message);
    }
}
