import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(1, "Polina Um Mich", "1993/08/13");
        Person p2 = new Person(2, "Vera Um Ivan", "1967/01/04");
        Person p3 = new Person(3, "Michail Um Cons", "1993/08/13");
        Person p4 = new Person(4, "Ivan Ross Kuz", "1993/08/13");

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        //System.out.println(people);

        p1.setMother(p2);
        p1.setFather(p3);
        p2.addChild(p1);

        FamilyTree ft = new FamilyTree(people);
        System.out.println(ft.getChildren(p2));
        System.out.println(ft.getPerson(1));
    }
}
