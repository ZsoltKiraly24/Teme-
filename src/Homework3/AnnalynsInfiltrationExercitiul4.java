package Homework3;

public class AnnalynsInfiltrationExercitiul4 {
    public static void main(String[] args) {
        boolean knightIsAwake=false;
        boolean archerIsAwake=true;
        boolean prisonerIsAwake=false;
        boolean petDogIsPresent=false;
        if ((knightIsAwake=false)||(archerIsAwake=false)||(prisonerIsAwake=false)||(petDogIsPresent=false)){
            System.out.println("Prisoner can be escaped");
        }
        else{
            System.out.println("Prisoner can't be escaped");
        }
    }
}
