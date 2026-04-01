import java.util.HashMap;
import java.util.Map;

/**
 * ===========================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * ===========================================
 *
 * use case 6: Map Bogie to Capacity
 *
 * Description:
 * this class associates each bogie with its seating or
 * load capacity using a key-value mapping structure
 *
 *
 * this application
 * creates a hashmap for bogie-capacity mapping
 * inserts capacity values for each bogie
 * iterates through map entries
 * displays bogie and capacity information
 *
 * this maps lookup based acces using hashMap
 *
 *
 * @author Samir
 * @version 6.0
 */
public class UseCase6TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("===================================");
        System.out.println("UC6 - map bogie to capacity");
        System.out.println("===================================");

        Map<String,Integer> capacityMap=new HashMap<>();
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo",120);
        capacityMap.put("Sleeper",72);
        capacityMap.put("AC Chair",56);

        System.out.println("Bogie Capacity Details: ");
        System.out.println(capacityMap);

        System.out.println("UC6 bogie-capacity mapping completed");
    }
}