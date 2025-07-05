import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public String name;
    public String dateOfBirth;
    public Person mother;
    public Person father;
    public List<Person> children;

    public Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person getMother(Person name){
        return this.mother;
    }

    public Person getFather(Person name){
        return this.father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }


    @Override
    public String toString() {
        return String.format("%s %s", name, dateOfBirth);
    }

    // @Override
    // public String toString() {
    //     return "\nPerson{" +
    //             ", name='" + name + '\'' +
    //             ", dateOfBirth='" + dateOfBirth + '\'' +
    //             ", mother=" + mother +
    //             ", father=" + father +
    //             '}';
    // }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(children, person.children) && Objects.equals(mother, person.mother) && Objects.equals(father, person.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, children, mother, father);
    }
}