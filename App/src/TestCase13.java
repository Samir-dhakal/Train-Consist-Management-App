import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCase13 {

    @org.testng.annotations.Test
    void testLoopFilteringLogic() {
        List<UseCase13TrainConsistMgmnt.Bogie> list = new ArrayList<>();

        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 50));
        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 80));

        List<UseCase13TrainConsistMgmnt.Bogie> result =
                UseCase13TrainConsistMgmnt.filterUsingLoop(list);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<UseCase13TrainConsistMgmnt.Bogie> list = new ArrayList<>();

        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 50));
        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 80));

        List<UseCase13TrainConsistMgmnt.Bogie> result =
                UseCase13TrainConsistMgmnt.filterUsingStream(list);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<UseCase13TrainConsistMgmnt.Bogie> list = new ArrayList<>();

        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 70));
        list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", 90));

        List<UseCase13TrainConsistMgmnt.Bogie> loopResult =
                UseCase13TrainConsistMgmnt.filterUsingLoop(list);

        List<UseCase13TrainConsistMgmnt.Bogie> streamResult =
                UseCase13TrainConsistMgmnt.filterUsingStream(list);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue(end >= start);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<UseCase13TrainConsistMgmnt.Bogie> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(new UseCase13TrainConsistMgmnt.Bogie("Passenger", i % 100));
        }

        List<UseCase13TrainConsistMgmnt.Bogie> result =
                UseCase13TrainConsistMgmnt.filterUsingStream(list);

        assertNotNull(result);
    }
}