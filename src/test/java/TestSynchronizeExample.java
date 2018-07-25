import junit.framework.TestCase;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

/**
 * Created by andriusbaltrunas on 7/25/2018.
 */
@RequiredArgsConstructor
class RunThread implements Runnable {

    private final SynchronizeExample synchronizeExample;
    private final String name;

    @Override
    public void run() {
        synchronizeExample.sayHi(name);
    }
}

public class TestSynchronizeExample {

    @Test
    public void testSync() {
        SynchronizeExample synchronizeExample = new SynchronizeExample();
        Thread t = new Thread(new RunThread(synchronizeExample, "foo1"));
        RunThread runThread = new RunThread(synchronizeExample, "bar");
        RunThread runThread2 = new RunThread(synchronizeExample, "foo");
        t.start();
        runThread.run();
        runThread2.run();
        if(t.isAlive()){
            System.out.println(t.getState());
        }
    }
}