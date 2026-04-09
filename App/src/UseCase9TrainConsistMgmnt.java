import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class UseCase9TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("=========================================");
        System.out.println("UC8-Filter Passenger Bogies Using Streams");
        System.out.println("=========================================");

        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",70));
        bogies.add(new Bogie("General",60));

        System.out.println("All Bogies");
        for(Bogie b: bogies){
            System.out.println(b.getName()+" -> "+b.getCapacity());

        }
        //--------- Group Using collectors.groupingBy------
        Map<String ,List<Bogie>> groupedBogies = bogies.stream().collect(Collectors.groupingBy(b ->b.getName()));
//Display groupted structure
        System.out.println("\n Grouped Bogies ");
        for(Map.Entry<String,List<Bogie>> entry:groupedBogies.entrySet()){
            System.out.println(entry);
        }
    }



}