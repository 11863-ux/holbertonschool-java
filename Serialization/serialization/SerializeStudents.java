import java.io.*;
import java.util.List;

public class SerializeStudents<T> {

    String fileName;

    public SerializeStudents(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(List<Student> students){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(students);
        }
        catch (IOException e) {
            System.out.println("Unable to serialize");
        }
    }

    public List<Student> deserialize() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            List<Student> studentsList=(List<Student>) in.readObject();
            studentsList.forEach(student-> student.setPassword(null));
            return studentsList;
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Unable to deserialize");
        }
        return null;
    }
}
