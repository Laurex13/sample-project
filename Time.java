package com.codewithrex;

public class Time {

    public static void main (String[]  args) {

        System.out.println(getDurationString (23 , 59 ,59 ));
    }


    private static String getDurationString( long hours, long minutes , long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
            long time = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + ": " + remainingMinutes + ": " + seconds ;
        }
    }

