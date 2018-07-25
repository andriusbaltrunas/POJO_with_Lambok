import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/25/2018.
 */
public class TestSneakyThrowsExample {

    @Test(expected = NullPointerException.class)
    public void testSneakyThrowsTest(){
        SneakyThrowsExample sneaky = new SneakyThrowsExample(null);
    }
}