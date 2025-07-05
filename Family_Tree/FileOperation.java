import java.io.IOException;

public interface FileOperation {

    public String generateCSV(String[] head, String colums);
    public void loadToFile(String name, String data);
    public void saveSerialObjectsToFile(FamilyTree familyTree, String fileName) throws IOException;
    public void loadSerialObjectsFromFile(String fileName) throws IOException, ClassNotFoundException;
}
