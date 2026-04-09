import java.util.ArrayList;
import java.util.List;




public class UseCase10TrainConsistMgmnt {
    public static void main(String[] args){
        System.out.println("===========================================");
        System.out.println("UC8-Filter Passenger Bogies Using Streams");
        System.out.println("===========================================");

        List<Bogie> bogies=new ArrayList<>();
        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",70));
        bogies.add(new Bogie("General",60));
        System.out.println("All Bogies");
        for(Bogie b: bogies){
            System.out.println(b.getName()+" -> "+b.getCapacity());
        }
        int totalCapacityOfTrain=bogies.stream().map(Bogie::getCapacity).reduce(0,(sum,cap)->sum+cap);
        System.out.println("\nTotal Seating Capacity of Train: "+totalCapacityOfTrain);
        }
    }



