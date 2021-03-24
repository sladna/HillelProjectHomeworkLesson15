package com.annasladkykh;

public class PracticeTask1 {
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(1, 40);
        TimeSpan timeSpan1 = new TimeSpan(2, 30);
        timeSpan1.add(timeSpan);
        System.out.println(timeSpan1);

        timeSpan1.sub(timeSpan);
        System.out.println(timeSpan1);

        timeSpan1.mult(0.5);
        System.out.println(timeSpan1);
    }
}