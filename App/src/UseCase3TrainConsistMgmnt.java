import java.util.HashSet;
import java.util.Set;

/**
 * ===========================================
 * MAIN CLASS - USECASE3TrainConsistMgmnt
 * ===========================================
 *
 * use case 3: Track Unique Bogie IDs
 *
 * Description:
 * this class ensures that duplicates bogies IDs are not added into the train formation using HashSet
 *
 *
 * this application
 * stores bogies IDs
 * prevents duplicate automatically
 * displays unique bogie identifiers
 *
 *
 * this maps validation using set
 *
 * @author Samir

 * @version 3.0
 */

public class UseCase3TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=========================================");

        Set<String> bogies=new HashSet<>();


        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogie IDs After Insertion: ");
        System.out.println(bogies);

        System.out.println("Note: ");
        System.out.println("Duplicates are automatically ignored by Hashset");

        System.out.println("UC3 uniqueness validation completed");
    }

}