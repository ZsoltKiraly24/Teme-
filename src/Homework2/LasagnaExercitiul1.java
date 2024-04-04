package Homework2;

public class LasagnaExercitiul1 {
    static int expectedMinutesinOven(int n){
        int done=40,i;
        for(i=1;i>=n;i++)
            done=i;
        return done;
    }

    public static void main(String[] args) {
        System.out.println("Lasagna is done in "+expectedMinutesinOven(41)+" minutes");
    }
}
