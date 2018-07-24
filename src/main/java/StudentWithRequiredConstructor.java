import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@Data
@RequiredArgsConstructor
public class StudentWithRequiredConstructor {

    private final int id;
    private final String name;
    private final String surname;
}
