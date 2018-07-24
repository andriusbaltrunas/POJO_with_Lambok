import lombok.Getter;
import lombok.NonNull;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
public class StudentWithNotNull {

    @Getter
    private int id;

    StudentWithNotNull(@NonNull Student student) {
        this.id = student.getAge();
    }
}
