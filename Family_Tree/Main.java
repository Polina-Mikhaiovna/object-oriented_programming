import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person polinaUM = new Person("Polina Um Mich", "1993/08/13");
        Person veraUI = new Person("Vera Um Ivan", "1967/01/4");
        Person michailUK = new Person("Michail Um Cons", "1965/11/13");
        Person ivanRK = new Person("Ivan Ross Kuz", "1937/09/6");

        List<Person> people = new ArrayList<>();
        people.add(polinaUM);
        people.add(veraUI);
        people.add(michailUK);
        people.add(ivanRK);

        polinaUM.setMother(veraUI);
        polinaUM.setFather(michailUK);
        veraUI.addChild(polinaUM);

        FamilyTree ft = new FamilyTree(people);
        System.out.println(people);
        
        FileOperation fo = new FileOperationImpl();

        String[] headers = { "Name", "dateOfBirth", "mother", "father", "children1", "children2" };
        String csvFileName = "FamilyTree.csv";
        String csv = new String();
        // создаём строку с хедерами перед строкой объекта FamilyTree (в дальнейшем нужно обработать содержимое самого дерева)
        csv = fo.generateCSV(headers, ft.toString());
        // записываем получившуюся строку (хедеры + FamilyTree)
        fo.loadToFile(csvFileName, csv);

        // создаем 2 потока для сериализации объекта и сохранения его в файл
        String home = System.getProperty("user.home");
        String filePath = home + "/git_workspase/object-oriented_programming_java/Family_Tree/data/save.ser";

       fo.saveSerialObjectsToFile(ft, filePath);
       fo.loadSerialObjectsFromFile(filePath);

       csv = ft.toStringForCsv();
       fo.loadToFile("FamilyTreeTest.csv", csv);

    }
}
