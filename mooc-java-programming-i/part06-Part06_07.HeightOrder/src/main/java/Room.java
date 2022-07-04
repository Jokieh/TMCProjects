import java.util.ArrayList;
import java.util.List;

public class Room {
    ArrayList<Person> personList = new ArrayList<>();

    public Room() {
        this.personList = personList;
    }

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        return personList.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personList;
    }

    public Person shortest() {
        Person shortest;

        if (!this.isEmpty()) {
            shortest = personList.get(0);
        } else return null;


        for (Person person : personList) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (!this.isEmpty()) {
            Person shortest = this.shortest();
            personList.remove(this.shortest());
            return shortest;
        } else return null;
    }
}
