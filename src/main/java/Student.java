import lombok.*;

/**
 * Created by andriusbaltrunas on 3/28/2018.
 */


@AllArgsConstructor
public class Student {
    private @Getter @Setter String name;
    private @Getter @Setter int age;
}
