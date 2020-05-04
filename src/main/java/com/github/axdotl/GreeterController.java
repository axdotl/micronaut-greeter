package com.github.axdotl;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;

import java.time.LocalTime;

@Controller("/")
public class GreeterController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        String message = "%s (my time is %s)";
        LocalTime now = LocalTime.now();
        return String.format(message, Greeter.getAppropriateWelcomeMessage(now), now);
    }
}
