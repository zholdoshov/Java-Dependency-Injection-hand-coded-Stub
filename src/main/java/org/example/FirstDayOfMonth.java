package org.example;
public class FirstDayOfMonth {
    ISystemClock sysClock;

    public FirstDayOfMonth() {
        this.sysClock = new GetDateTime();
    }

    public FirstDayOfMonth(ISystemClock injSystemClock) {
        this.sysClock = injSystemClock;
    }

    public boolean todayIsFirstDayOfMonth() {
        boolean firstDay = false;
        if (1 == sysClock.getDayOfMonth())
            firstDay = true;
        return firstDay;
    }
}
