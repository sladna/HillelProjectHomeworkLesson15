package com.annasladkykh;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 59) {
            throw new IllegalArgumentException("Invalid value of minutes");
        } else if (hours > 23) {
            throw new IllegalArgumentException("Invalid value of hours");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        int hours = this.hours + timeSpan.hours;
        int minutes = this.minutes + timeSpan.minutes;
        if (minutes > 60) {
            hours += 1;
            minutes -= 60;
        }
    }

    public void sub(TimeSpan timeSpan) {
        this.hours -= timeSpan.hours;
        this.minutes -= timeSpan.minutes;
        if (timeSpan.minutes < 60) {
            this.hours -= 1;
            this.minutes += 60;
        }
    }

    public void mult(double times) {
        this.hours *= times;
        this.minutes *= times;
        if (minutes < 1) {
            this.hours -= 1;
            this.minutes += 60;
        } else if (minutes >= 60) {
            this.hours += 1;
            this.minutes -= 60;
        }

    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }

}