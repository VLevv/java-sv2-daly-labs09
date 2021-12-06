package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private int code;

    public FrontOfStageTicket(String name, LocalDateTime time, int price, int code) {
        super(name, time, price);
        this.code = code;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(getTime().getHour(),getTime().getMinute()).minusHours(2);
    }
}
