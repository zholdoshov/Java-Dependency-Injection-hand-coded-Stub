package org.example;
public class FirstDayOfMonth {
    GetDateTime sysClock;

    public FirstDayOfMonth() {
        this.sysClock = new GetDateTime();
    }

    public boolean todayIsFirstDayOfMonth() {
        boolean firstDay = false;
        if (1 == sysClock.getDayOfMonth())
            firstDay = true;
        return firstDay;
    }
}
