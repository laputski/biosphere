package biosphere.web.Vorobey.lab3;

/**
 * Created by VD on 09.10.2015.
 */

public class MainTest {
    public static void main_LB3_VorobeyV(String[] args) {

        int numberOfNotes[] = new int[]{
                (int)Math.pow(10,3)
                ,(int)Math.pow(10,5)
                ,5*((int)Math.pow(10,5))
        };

        PerformanceComparator performanceTest = new PerformanceComparator();
        performanceTest.fullTestPerformance(numberOfNotes);

    }
}

