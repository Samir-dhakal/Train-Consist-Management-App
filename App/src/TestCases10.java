import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCases10 {
    UseCase10TrainConsistMgmnt app=new UseCase10TrainConsistMgmnt();
    @Test
    public void testReduce_TotalSeatCalculation(){
        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        int totalSeats=bogies.stream().map(Bogie::getCapacity).reduce(0, Integer::sum);
        assertEquals(128,totalSeats);
    }
    @Test
    public void testReduce_MultipleBogiesAggregation(){
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)

        );
        int totalCapacity=bogies.stream().map(bogie -> bogie.getCapacity()).reduce(0,Integer::sum);
        assertEquals(222,totalCapacity);
    }
    @Test
    public void testReduce_SingleBogieCapacity(){
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72));
        int totalCapacity=bogies.stream().map(bogie -> bogie.getCapacity()).reduce(0,Integer::sum);
        assertEquals(72,totalCapacity);
    }
    @Test
    public void testReduce_EmptyBogieList(){
        List<Bogie> bogies = Arrays.asList();
        int totalCapacity=bogies.stream().map(bogie -> bogie.getCapacity()).reduce(0,Integer::sum);
        assertEquals(0,totalCapacity);
    }
    @Test
    public void testReduce_CorrectCapacityExtraction(){
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 50),
                new Bogie("AC Chair", 60)
        );

        List<Integer> capacities = bogies.stream()
                .map(Bogie::getCapacity)
                .collect(Collectors.toList());

        assertEquals(List.of(50, 60), capacities);
    }
    @Test
    public void testReduce_AllBogiesIncluded(){
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 50),
                new Bogie("AC Chair", 60)
        );
        Set<String> boggies=bogies.stream().map(Bogie::getName).collect(Collectors.toSet());
        assertTrue(boggies.contains("Sleeper"));
        assertTrue(boggies.contains("AC Chair"));
    }
    @Test
    public void testReduce_OriginalListUnchanged(){
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)

        );
        List<Bogie> orginal = bogies;
        int totalCapacity=bogies.stream().map(bogie -> bogie.getCapacity()).reduce(0,Integer::sum);
        assertEquals(orginal,bogies);
    }
}
