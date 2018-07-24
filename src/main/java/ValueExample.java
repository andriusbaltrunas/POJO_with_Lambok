import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.Wither;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
@Value
public class ValueExample {
    private int id;
    @NonFinal
    private String name;
    @Wither(AccessLevel.PROTECTED) private String surname;

}
