package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void testAddPerson() {
        Person person = new Person(new Ticket("jani", LocalDateTime.of(2000,1,1,13,20),2000));
        Person person2 = new Person(new FrontOfStageTicket("jani", LocalDateTime.of(2000,1,1,13,20),2000,123));
        Concert concert = new Concert();
        concert.addPerson(person, LocalTime.of(12,40));
        assertEquals(1,concert.getPeople().size());
        concert.addPerson(person2,LocalTime.of(11,40));
        assertEquals(2,concert.getPeople().size());
        assertThrows(IllegalArgumentException.class,()->concert.addPerson(person,LocalTime.of(9,30)));
    }
}