 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        
        
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        
        String nums = "";
        
        for(int i = 1; i <tableSize+1; i++){
            for(int j = 1; j < tableSize+1; j++){
             nums += String.format("%3d |", j*i);
            }
          nums += "\n";
        }
        
        return nums;
    }
}
