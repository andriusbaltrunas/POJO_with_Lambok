import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */

@Data(staticConstructor = "create")
public class DataExample {
    private final int id;
    @Getter(AccessLevel.PROTECTED)
    private final String name;
}
