package Homework2;

public class LasagnaExercitiul4 {
     static int layersAdded(int n){
        int layers=3,i;
        for(i=0;i<4;i++)
            layers=i;
        return layers;
    }
    static int bakingMinute(int m){
         int lasagnaInOven=15,j;
         for(j=0;j<=20;j++)
             lasagnaInOven=j;
         return lasagnaInOven;
    }

    public static void main(String[] args) {
        System.out.println("Total time preparing lasagna is "+(layersAdded(3)+bakingMinute(20))+" minutes");
    }
}
