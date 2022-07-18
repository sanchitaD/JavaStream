package com.java8.practise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.SimpleFormatter;

@FunctionalInterface
public interface InterfaceFunction {

    String makePayment(String source, String destination);

    default double getScratchCard(){
        return new Random().nextDouble();
    }

    static String getDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        return dateFormat.format(new Date());
    }
}
