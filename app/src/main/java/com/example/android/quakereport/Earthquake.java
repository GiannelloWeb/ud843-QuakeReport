package com.example.android.quakereport;

import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Earthquake {
    private double mag;
    private String place;
    private long time;

    public Earthquake (double mag, String place, long time ){
        this.mag = mag;
        this.place = place;
        this.time = time;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }


    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMag() {
        Log.i("Earthquake", "getMag: " + mag);
        return String.valueOf(mag);

    }

    public String getTime() {
        Date mDate = new Date(time);
        String sDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(mDate) + "\n " +
                DateFormat.getTimeInstance(DateFormat.MEDIUM).format(mDate);
        Log.i("Earthquake", "getTime: " + sDate);
        return sDate;
    }

    public String getPlace() {
        return place;
    }
}
