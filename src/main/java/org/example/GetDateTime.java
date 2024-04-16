package org.example;

import java.util.Calendar;
import java.util.Date;

public class GetDateTime implements ISystemClock{
    @Override
    public int getDayOfMonth() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }
}
