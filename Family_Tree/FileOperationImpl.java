import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperationImpl implements FileOperation {

    public String generateCSV(String[] head, String colums) {

        StringBuilder buildedCSV = new StringBuilder();
        String tempStr = new String();
        tempStr = String.join(", ", head);
        buildedCSV = buildedCSV.append(tempStr).append("\n");
        buildedCSV = buildedCSV.append(colums);

        return buildedCSV.toString();
    }

    public void loadToFile(String fileName, String data) {
        String home = System.getProperty("user.home");
        String filePath = home + "/git_workspase/object-oriented_programming_java/Family_Tree/data/" + fileName;
        try (FileWriter fw = new FileWriter(filePath, false)) {
            fw.write(data);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void saveSerialObjectsToFile(FamilyTree familyTree, String fileName) throws IOException {

        try (FileOutputStream outputStream = new FileOutputStream(fileName);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {
            // сохраняем игру в файл
            objectOutputStream.writeObject(familyTree);
            // закрываем поток и освобождаем ресурсы
            objectOutputStream.close();
        }
    }

    @Override
    public void loadSerialObjectsFromFile(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            FamilyTree family_Tree = (FamilyTree) objectInputStream.readObject();

            System.out.println(family_Tree);
        }

    }

}
