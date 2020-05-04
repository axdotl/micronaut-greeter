package com.github.axdotl;

import java.time.LocalTime;

public class Greeter {

    public static final String GOOD_MORNING = "Good Morning";
    public static final String GOOD_AFTERNOON = "Good Afternoon";
    public static final String GOOD_NIGHT = "Good Night";

    public static String getAppropriateWelcomeMessage(LocalTime now) {
        if (now.isBefore(LocalTime.NOON)) {
            return GOOD_MORNING;
        }
        if(now.isBefore(LocalTime.of(18, 0))) {
            return GOOD_AFTERNOON;
        }

        return GOOD_NIGHT;
    }
}
