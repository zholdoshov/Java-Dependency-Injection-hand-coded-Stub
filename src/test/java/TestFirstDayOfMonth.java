import org.example.FirstDayOfMonth;
import org.example.GetDateTimeStub;
import org.example.ISystemClock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestFirstDayOfMonth {

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "2, false",
            "31, false",
    })
    public void firstDayOfMonthParameterizedTest(int inputVal, boolean expected) {
        GetDateTimeStub getDateTimeStub = new GetDateTimeStub(inputVal);
        FirstDayOfMonth firstDayOfMonth = new FirstDayOfMonth(getDateTimeStub);
        boolean actual = firstDayOfMonth.todayIsFirstDayOfMonth();
        Assertions.assertEquals(expected, actual);
    }
}
