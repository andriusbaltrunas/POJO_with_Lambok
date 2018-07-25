import lombok.Synchronized;

/**
 * Created by andriusbaltrunas on 7/25/2018.
 */
public class SynchronizeExample {

    @Synchronized
    public void sayHi(String name) {
        System.out.println("Hello " + name);
    }

}
