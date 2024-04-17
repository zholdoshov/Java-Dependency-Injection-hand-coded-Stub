package org.example;

public class GetDateTimeStub implements ISystemClock {

    private int day;

    public GetDateTimeStub(int value) {
        this.day = value;
    }
    @Override
    public int getDayOfMonth() {
        return day;
    }
}
