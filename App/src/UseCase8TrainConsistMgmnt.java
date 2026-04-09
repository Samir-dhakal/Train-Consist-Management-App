import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ===========================================
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 * ===========================================
 *
 * use case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * this class sorts passenger bogies based on seating capacity using
 * a custom comparator
 *
 *
 * this application
 * creates bogie objects
 * Stores them in a list
 * Display the unsorted data
 * Sorts Using Comparator logic
 * Displays sorted result
 *
 * this maps  custom ordering using comparator
 *
 *
 * @author Samir
 * @version 7.0
 */
public class UseCase8TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("===========================================");
        System.out.println("UC8-Filter Passenger Bogies Using Streams");
        System.out.println("===========================================");

        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",90));

        System.out.println("All Bogies");
        for(Bogie b: bogies){
            System.out.println(b.getName()+" -> "+b.getCapacity());

        }

        System.out.println("Filtered Bogies (Capacity > 60)");

        bogies.stream().filter(bogie -> bogie.getCapacity()>70).forEach(System.out::println);

    }
    public List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() >=60) // match your test cases
                .collect(Collectors.toList());
    }


}