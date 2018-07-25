import lombok.SneakyThrows;

/**
 * Created by andriusbaltrunas on 7/25/2018.
 */
public class SneakyThrowsExample {

    private int id;

    @SneakyThrows(NullPointerException.class)
    SneakyThrowsExample(DataExample dataExample){
        this.id = dataExample.getId();
    }
}
