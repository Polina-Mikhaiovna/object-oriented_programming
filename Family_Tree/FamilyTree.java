import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class FamilyTree implements Serializable {

    private static final long serialVersionUID = 1L;

    public List<Person> people;

    public FamilyTree(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getChildren(Person parent) {
        return parent.getChildren();
    }

    public Person getPerson(String name) {
        for (Person person : people) {
            if (Objects.equals(person.getName(), name)) {
                return person;
            }
        }
        return null;
    }

    public Person findPersonByName(String name) {
        String[] nameSurPatr = name.split(" ");
        for (Person person : people) {
            for (int n = 0; n < nameSurPatr.length; n++) {
                if (person.getName().toString().contains(nameSurPatr[n])) {
                    return person;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Семейное древо:\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");

            if (p.mother != null) {
                sb.append("  Мать: ").append(p.mother.toString()).append("\n");
            }
            if (p.father != null) {
                sb.append("  Отец: ").append(p.father.toString()).append("\n");
            }

            if (!p.children.isEmpty()) {
                sb.append("  Дети:\n");
                for (Person child : p.children) {
                    sb.append("    - ").append(child.toString()).append("\n");
                }
            }

            sb.append("\n");
        }
        return sb.toString();

    }

    public String toStringForCsv() {
        StringBuilder sb = new StringBuilder();
        String[] headers = { "Name", "dateOfBirth", "mother", "father", "children1", "children2" };
        String tempStr = String.join(", ", headers);
        sb.append(tempStr).append("\n");
        for (Person p : people) {
            sb.append(p.getName()).append(", ").append(p.getDateOfBirth());
            if (p.mother != null) {
                sb.append(", ").append(p.getMother(p));
            }
            if (p.father != null) {
                sb.append(", ").append(p.getFather(p));
            }
            if (!p.children.isEmpty()) {
                for (Person child : p.children){
                    sb.append(", ").append(child);
                }
            } else {
                sb.append("\n");
            }

        }
        return sb.toString();

    }

}
