package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String name;
    private LocalDateTime time;
    private int price;

    public Ticket(String name, LocalDateTime time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime(){
        return LocalTime.of(time.getHour(),time.getMinute()).minusHours(1);
    }
}
