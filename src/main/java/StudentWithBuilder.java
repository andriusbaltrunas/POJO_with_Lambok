import lombok.Builder;
import lombok.Getter;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */

@Builder
public class StudentWithBuilder {
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private String surname;
}
