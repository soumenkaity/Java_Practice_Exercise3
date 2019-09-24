package com.stackroute.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstLastDateOfAWeek {
    public void firstAndLastDayOfWeek(){
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar calendar=Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        System.out.println("First Date of Week : "+df.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        System.out.println("Last Date of Week : "+df.format(calendar.getTime()));
    }
}
