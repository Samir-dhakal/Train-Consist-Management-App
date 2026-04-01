import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================
 * MAIN CLASS - USECASE2TrainConsistMgmnt
 * ===========================================
 *
 * use case 1: Add Passenger Bogies To train
 *
 * description: this class demonstrate how passenger bogies can be managed
 * dynamically using ArrayList operations
 *
 *
 * this application
 *adds new bogies to the train
 * removes existing bogies
 * Checks for bogie availability
 * Displays the final consist
 *
 * @author Samir
 * @version 2.0
 */
public class UseCase2TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================");

        List<String> passengerBogies=new ArrayList<>();
        //adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies");
        System.out.println("Passenger Bogies: "+passengerBogies);

        //removing ac chair
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing AC Chair");
        System.out.println("Passenger Bogies: "+passengerBogies);

        if(passengerBogies.contains("Sleeper")){
            System.out.println("Contain Sleeper? : "+true);
        }

        System.out.println("Final Train Passenger Consist: ");
        System.out.println(passengerBogies);

        System.out.println("UC2 operations completed succesfully");
    }

}