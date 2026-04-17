import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TestCase12 {
    @Test
    void testSafety_AllBogiesValid(){
        List<UseCase12TrainConsistMgmnt.GoodBogies> goodBogies= Arrays.asList(
                new UseCase12TrainConsistMgmnt.GoodBogies("Cylindrical","Petroleum"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Open","Coal"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Box","Grain")

        );
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        assertTrue(isSafe);
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo(){
        List<UseCase12TrainConsistMgmnt.GoodBogies> goodBogies= Arrays.asList(
                new UseCase12TrainConsistMgmnt.GoodBogies("Cylindrical","Coal"));
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        assertFalse(isSafe);
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed(){
        List<UseCase12TrainConsistMgmnt.GoodBogies> goodBogies= Arrays.asList(
                new UseCase12TrainConsistMgmnt.GoodBogies("Open","Coal"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Box","Grain")

        );
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        assertTrue(isSafe);
    }

    @Test
    void testSafety_MixedBogiesWithViolation(){
        List<UseCase12TrainConsistMgmnt.GoodBogies> goodBogies= Arrays.asList(
                new UseCase12TrainConsistMgmnt.GoodBogies("Cylindrical","Petroleum"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Open","Coal"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Box","Grain"),
                new UseCase12TrainConsistMgmnt.GoodBogies("Cylindrical","Coal")

        );
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        assertFalse(isSafe);
    }

    @Test
    void testSafety_EmptyBogieList(){
        List<UseCase12TrainConsistMgmnt.GoodBogies> goodBogies=Arrays.asList();
        boolean isSafe = goodBogies.stream().allMatch(gb -> {
            if (gb.type.equalsIgnoreCase("Cylindrical")) {
                return gb.cargo.equalsIgnoreCase("Petroleum");
            }
            return true;
        });
        assertTrue(isSafe);
    }




}