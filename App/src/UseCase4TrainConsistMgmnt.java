import java.util.LinkedList;
import java.util.List;

/**
 * ===========================================
 * MAIN CLASS - USECASE4TrainConsistMgmnt
 * ===========================================
 *
 * use case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * this class models the physical chaining of train bogies
 *
 * this application
 * adds bogies in sequence
 * inserts bogies at specific positions
 * removes bogies from front and rear
 * displays updated train structure
 *
 * this maps positional operations using linked list
 *
 * @author Samir
 * @version 4.0
 */

public class UseCase4TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("===================================");

        List<String> trainConsist =new LinkedList<>();
        trainConsist.add("engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: ");
        System.out.println(trainConsist);

        //adding pantry car at postion 2
        trainConsist.add(2,"Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2: ");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After removing the first and last bogie: ");
        System.out.println(trainConsist);

        System.out.println("UC4 ordered consist operations completed ....");

    }
}