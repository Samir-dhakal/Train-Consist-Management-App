import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================
 * MAIN CLASS - USECASE1TrainConsistMgmnt
 * ===========================================
 *
 * use case 1: initailze train and display consist summary
 *
 * description: this class represent the entry point of the train consist management app
 *
 * this application creates and empty train consist , uses a dynamic list to store bogies
 * display initial bogie count
 * prints the current state of the train
 *
 * @author Samir
 * @version 1.0
 */
public class UseCase1TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("==================================");
        System.out.println("==Train Consist Management App==");
        System.out.println("==================================");

        //creating a dynamic list
        List<String> trainConsist=new ArrayList<>();

        System.out.println("Train initialized sucessfully.....");
        System.out.println("Initial Bogie Count: "+trainConsist.size());
        System.out.println("Current Train Consist: "+trainConsist);

    }

}