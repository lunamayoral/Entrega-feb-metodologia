package es.uah.mat.comp.mp.eja.e8;

import java.text.DecimalFormat;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toString() {
        DecimalFormat twoDigits = new DecimalFormat("00");
        String Hour = twoDigits.format(this.hour);
        String Minute = twoDigits.format(this.minute);
        String Second = twoDigits.format(this.second);

        return Hour + " : " + Minute + " : " + Second;
    }

    public Time nextSecond(){
        this.second=second+1;
        if(second==60){
            this.minute=minute+1;
            this.second=0;
            if(minute==60) {
                this.hour = hour + 1;
                this.minute = 0;
                if (hour == 24) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        this.second=second-1;
        if(second==-1){
            this.minute=minute-1;
            this.second=59;
            if(minute==-1) {
                this.hour = hour - 1;
                this.minute = 59;
                if (hour == -1) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}