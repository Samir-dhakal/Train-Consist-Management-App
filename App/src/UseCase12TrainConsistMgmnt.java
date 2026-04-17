/**
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 *
 * use case 12: Safety Compliance Check for Good Bogies
 *
 * description:
 * this class enforces the domain safety rules on good bogies
 *
 * this application:
 * creates goods bogies list
 *convert list into stream
 * applies safety validation rule
 * check compliance using allMatch()
 * displays safety status
 *
 * @author Samir
 * @version 12.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmnt {
    static  class GoodBogies{
        String type;
        String cargo;
        GoodBogies(String type,String cargo){
            this.type=type;
            this.cargo=cargo;
        }
    }
    public static void main(String[] args){
        System.out.println("==============================================");
        System.out.println("UC12- Safety Compliance Check for Good Bogies");
        System.out.println("==============================================");

        List<GoodBogies> goodBogies=new ArrayList<>();

        goodBogies.add(new GoodBogies("Cylindrical","Petroleum"));
        goodBogies.add(new GoodBogies("Open","Coal"));
        goodBogies.add(new GoodBogies("Box","Grain"));
        goodBogies.add(new GoodBogies("Cylindrical","Coal"));

        System.out.println("Good Bogies in Train:");
        for(GoodBogies gb: goodBogies){
            System.out.println(gb.type+" --> "+gb.cargo);
        }
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        System.out.println("\nSafety Compliance Status: "+ isSafe);
        if(isSafe){
            System.out.println("Train formation is  SAFE");
        }
        else
            System.out.println("Train formation is NOT SAFE");

    }
}