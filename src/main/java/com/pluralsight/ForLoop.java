package com.pluralsight;

public class ForLoop {
    public void main() throws InterruptedException {
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);

            Thread.sleep(1000);
        }
        System.out.println("Launch!");

        // throws interruptedException pauses 1 second between each number to slow the countdown.
    }
}
