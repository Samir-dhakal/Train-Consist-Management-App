import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ===========================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * ===========================================
 *
 * use case 5: Maintain Ordered Bogie Consist
 *
 * Description:
 * this class maintains the exact statement order of bogies
 * while also preventing duplicates entries using linkedHashset
 *
 *
 * this application
 * attaches bogies in order
 * preserves insertion sequence
 * avoids duplicates bogies
 * displays final train formation
 *
 * this maps ordered uniqueness using LinkedHashSet
 *
 *
 * @author Samir Dhakal
 * @version 5.0
 */

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("===========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================");

        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Engine");
        formation.add("Sleeper");
        System.out.println("Final Train Formation: ");
        System.out.println(formation);
        System.out.println("Note: ");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically");

        System.out.println("UC5 formation setup completed");
    }
}