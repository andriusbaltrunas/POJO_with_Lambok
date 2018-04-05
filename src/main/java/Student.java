import lombok.*;

/**
 * Created by andriusbaltrunas on 3/28/2018.
 */


@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private @Setter @Getter String name;
    private @Setter @Getter int age;
}
