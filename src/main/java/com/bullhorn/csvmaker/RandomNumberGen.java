package com.bullhorn.csvmaker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class RandomNumberGen {

    Random randomNum = new Random();
    SimpleDateFormat dateFormat = new SimpleDateFormat("M:dd:yyyy");
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();

    public int randInt(int min, int max){
        return randomNum.nextInt((max-min)+1)+ min;
    }

    public String randString(int min, int max){
        return Integer.toString(randomNum.nextInt((max-min)+1)+ min);
    }

    public String randDate(){

        calendar.setTimeInMillis(date.getTime());
        long startDate = calendar.getTimeInMillis();
        calendar.add(Calendar.DAY_OF_YEAR,365);
        long endDate = calendar.getTimeInMillis();
        long randomDateMilliSecs = startDate + (long)(randomNum.nextDouble()*(endDate-startDate));
        return dateFormat.format(randomDateMilliSecs).toString().replace(":","/");
    }

}
