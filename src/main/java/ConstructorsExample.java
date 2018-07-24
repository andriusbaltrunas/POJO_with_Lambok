import lombok.*;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor(staticName = "create")
public class ConstructorsExample {
    private String name;
    @NonNull
    private int id;
}
