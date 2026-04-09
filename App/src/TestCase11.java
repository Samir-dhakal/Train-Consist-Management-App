import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

public class TestCase11 {
    @Test
    void Regex_ValidTrainId(){
        String   trainId="TRN-1234";
        String trainRegex="^TRN-\\d{4}$";
        Pattern trainPattern=Pattern.compile(trainRegex);
        Matcher trainMatcher=trainPattern.matcher(trainId);
        assertTrue(trainMatcher.matches());

    }
    @Test
    void testRegex_InvalidTrainIDFormat(){
        String trainId1="TRAIN12";
        String trainId2="TRN12A";
        String trainId3="1234-TRN";
        String trainRegex="^TRN-\\d{4}$";
        Pattern trainPattern=Pattern.compile(trainRegex);
        Matcher trainMatcher1=trainPattern.matcher(trainId1);
        Matcher trainMatcher2=trainPattern.matcher(trainId2);
        Matcher trainMatcher3=trainPattern.matcher(trainId3);

        assertFalse(trainMatcher1.matches());
        assertFalse(trainMatcher2.matches());
        assertFalse(trainMatcher3.matches());

    }

    @Test
    void testRegex_ValidCargoCode(){
        String cargoCode="PET-AB";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);
        Matcher cargoMatcher=cargoCodePattern.matcher(cargoCode);
        assertTrue(cargoMatcher.matches());
    }

    @Test
    void testRegex_InvalidCargoCodeFormat(){
        String cargoCode1="PET-ab";
        String cargoCode2="PET123";
        String cargoCode3="AB-PET";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);
        Matcher cargoMatcher1=cargoCodePattern.matcher(cargoCode1);
        Matcher cargoMatcher2=cargoCodePattern.matcher(cargoCode2);
        Matcher cargoMatcher3=cargoCodePattern.matcher(cargoCode3);
        assertFalse(cargoMatcher1.matches());
        assertFalse(cargoMatcher2.matches());
        assertFalse(cargoMatcher3.matches());
    }
    @Test
    void testRegex_TrainIDDigitLengthValidation(){
        String   trainId1="TRN-123";
        String   trainId2="TRN-12345";
        String trainRegex="^TRN-\\d{4}$";
        Pattern trainPattern=Pattern.compile(trainRegex);
        Matcher trainMatcher1=trainPattern.matcher(trainId1);
        Matcher trainMatcher2=trainPattern.matcher(trainId2);
        assertFalse(trainMatcher1.matches());
        assertFalse(trainMatcher2.matches());
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation(){
        String cargoCode="PET-ab";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);
        Matcher cargoMatcher=cargoCodePattern.matcher(cargoCode);
        assertFalse(cargoMatcher.matches());
    }
    @Test
    void testRegex_EmptyInputHandling(){
        String trainId="";
        String cargoCode="";
        String trainIdRegex = "^TRN-\\d{4}$";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";

        Pattern trainIdPattern=Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);

        Matcher trainMatcher=trainIdPattern.matcher(trainId);
        Matcher cargoMatcher=cargoCodePattern.matcher(cargoCode);
        assertFalse(trainMatcher.matches());
        assertFalse(cargoMatcher.matches());
    }
    @Test
    void testRegex_ExactPatternMatch(){
        String trainId="TRN-12345 ";
        String cargoCode="PET-AB ";
        String trainIdRegex = "^TRN-\\d{4}$";
        String cargoCodeRegex = "^PET-[A-Z]{2}$";

        Pattern trainIdPattern=Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern=Pattern.compile(cargoCodeRegex);

        Matcher trainMatcher=trainIdPattern.matcher(trainId);
        Matcher cargoMatcher=cargoCodePattern.matcher(cargoCode);
        assertFalse(trainMatcher.matches());
        assertFalse(cargoMatcher.matches());
    }


}