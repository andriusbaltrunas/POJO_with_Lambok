import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
@ToString(exclude = "surname")
@RequiredArgsConstructor
public class ToStringExample {

    private static final int NUMB = 10;

    private final int age;
    private final String name;
    private final String surname;
}
