package Homework2;

public class LasagnaExercitiul3 {
    static int preparationTimeInMinutes (int n){
        int layers=4,i;
        for (i=0;i<5;i++)
            layers=i;
        return layers;
    }

    public static void main(String[] args) {
        System.out.println("Minutes preparing lasagna is "+(preparationTimeInMinutes(4)*2)+" minutes");
    }
}
