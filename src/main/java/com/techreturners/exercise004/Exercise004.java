package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class Exercise004 {

    LocalDateTime date;
    private final static long GIGA_SECOND = 1_000_000_000;

    public Exercise004(LocalDate date) {
        LocalDateTime newDateTime = date.atStartOfDay();
        newDateTime = newDateTime.plus(GIGA_SECOND, ChronoUnit.SECONDS);
        this.date = newDateTime;
    }

    public Exercise004(LocalDateTime dateTime) {
        LocalDateTime newDateTime = dateTime.plus(GIGA_SECOND, ChronoUnit.SECONDS);
        this.date = newDateTime;
    }

    public LocalDateTime getDateTime() {
        return date;
    }
}
