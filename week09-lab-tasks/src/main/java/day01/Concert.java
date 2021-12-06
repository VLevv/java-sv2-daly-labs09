package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private List<Person> people=new ArrayList<>();

    public void addPerson(Person person, LocalTime time){
        if(time.isAfter(person.getTicket().entryTime())){
            people.add(person);
        }else {
            throw new IllegalArgumentException("Can not enter yet");
        }
    }

    public List<Person> getPeople() {
        return people;
    }
}
