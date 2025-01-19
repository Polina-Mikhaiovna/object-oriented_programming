import java.util.List;
import java.util.Objects;

public class FamilyTree {

    public List<Person> people;
//    public int generations;

    public FamilyTree(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getChildren(Person parent) {
        return parent.getChildren();
    }

    public Person getPerson(int id) {
        for (Person person : people) {
            if (Objects.equals(person.getId(), id)) {
                return person;
            }
        }
        return null;
    }

}
