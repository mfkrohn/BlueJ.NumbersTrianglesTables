 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for(int i = 0; i < numberOfStars; i++){
          row = row + "*";  
        }
        
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String row = "";
        String tri = "";
        for(int i = 0; i < numberOfRows; i++){
          tri += "*"; 
          row += tri;
          row +="\n";
        }
        
        return row;
    }


    public static String getSmallTriangle() {
        String row = "";
        String tri = "";
        for(int i = 0; i < 4; i++){
          tri += "*"; 
          row += tri;
          row +="\n";
        }
        
        return row;
    }

    public static String getLargeTriangle() {
        String row = "";
        String tri = "";
        for(int i = 0; i < 9; i++){
          tri += "*"; 
          row += tri;
          row +="\n";
        }
        
        return row;
    }
}
