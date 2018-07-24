import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
@EqualsAndHashCode(exclude = "surname")
@RequiredArgsConstructor
public class EqualsAndHashCodeExample {
    private final int id;
    private final String name;
    private final String surname;
}
