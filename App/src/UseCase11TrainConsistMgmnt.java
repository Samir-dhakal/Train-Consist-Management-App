import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmnt {
    public static  void main(String[] args){
        System.out.println("======================================");
        System.out.println("UC11:validate Train ID and Cargo Code");
        System.out.println("======================================");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Train ID (Format: TRN-1234): ");
        String trainId=sc.nextLine();

        System.out.println("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode=sc.nextLine();


        // defining the regex
        String trainIdRegex = "^TRN-\\d{4}$";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";

        Pattern trainIdPattern=Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);

        Matcher trainMatcher=trainIdPattern.matcher(trainId);
        Matcher cargoMatcher=cargoCodePattern.matcher(cargoCode);
        System.out.println("Train Id Valid:"+trainMatcher.matches());
        System.out.println("Cargo code Valid: "+cargoMatcher.matches());

    }
}