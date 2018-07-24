import lombok.Cleanup;
import lombok.val;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class StudentWithCleanup {

    private static final String FILE_NAME = "students.txt";

    public ArrayList<Object> readFileWithStudents() {
        val students = new ArrayList<>();
        try {
            @Cleanup BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME)));
            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                students.add(new Student(items[0], Integer.valueOf(items[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
