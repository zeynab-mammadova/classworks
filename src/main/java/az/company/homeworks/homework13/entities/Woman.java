package az.company.homeworks.homework13.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

public final class Woman extends Human implements Serializable {
    public Woman(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq, Family family) {
        super(name, surname, birthDate, iq, family);
    }

    public Woman(String name, String surname, LocalDate birthDate, int iq, Map<String, String> schedule) {
        super(name, surname, birthDate, iq, schedule);
    }

    Woman(String name, String surname, LocalDate birthDate, int iq, Map<String, String> schedule, Family family) {
        super(name, surname, birthDate, iq, schedule, family);
    }

    public Woman(String name, String surname, LocalDate birthDate, int iq) {
        super(name, surname, birthDate, iq);
    }


    @Override
    void greetPet() {
        System.out.println("Hello");
    }
    void readBook(){
        System.out.println("I'm reading");
    }
}