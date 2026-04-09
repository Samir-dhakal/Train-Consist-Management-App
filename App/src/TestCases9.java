import org.junit.jupiter.api.Test;

import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestCases9 {
UseCase9TrainConsistMgmnt app=new UseCase9TrainConsistMgmnt();
    @Test
    void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",70));
        bogies.add(new Bogie("General",60));

        Map<String ,List<Bogie>> groupedBogies = bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
        assertEquals(1, groupedBogies.get("Sleeper").size());


    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",70));
        bogies.add(new Bogie("General",60));
        Map<String ,List<Bogie>> groupedBogies = bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
        assertEquals(2, groupedBogies.get("General").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",70));
        bogies.add(new Bogie("General",60));
        Map<String ,List<Bogie>> groupedBogies = bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
        assertEquals(2, groupedBogies.get("General").size());
        assertEquals(1, groupedBogies.get("Sleeper").size());


    }

    @Test
    void testGrouping_EmptyBogieList(){
        List<Bogie> bogies=new ArrayList<>();

        Map<String ,List<Bogie>> groupedBogies = bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
assertTrue(groupedBogies.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 80)
        );
        Map<String, List<Bogie>> grouped = bogies.stream().collect(Collectors.groupingBy(Bogie::getName));

        assertEquals(1, grouped.size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys()
    {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        Map<String,List<Bogie>> grouped=bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
        assertTrue(grouped.containsKey("Sleeper"));
        assertTrue(grouped.containsKey("AC Chair"));
        assertTrue(grouped.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );


        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));



        assertEquals(2,grouped.get("Sleeper").size());

        assertEquals(2,grouped.get("AC Chair").size());
        assertEquals(1,grouped.get("First Class").size());

    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );
        List <Bogie> bogies1=bogies;
        Map<String, List<Bogie>> grouped =
                bogies.stream().collect(Collectors.groupingBy(Bogie::getName));
        assertEquals(bogies1,bogies);
    }
}