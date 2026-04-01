import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
public class UseCase7TrainConsistMgmnt {
    static class Bogie{
        String name;
        int capacity;
        public Bogie(String name, int capacity){
            this.name=name;
            this.capacity=capacity;
        }
    }
    public static void main(String[] args){
        System.out.println("=============================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("==============================");

        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",90));

        System.out.println("Before Sorting:");
        for(Bogie b:bogies){
            System.out.println(b.name+" ->" + b.capacity);
        }

        Collections.sort(bogies,(a,b)->a.capacity-b.capacity);
        System.out.println("After Sorting:");
        for(Bogie b:bogies){
            System.out.println(b.name+" ->" + b.capacity);
        }
    }
}