package Homework4;

import java.util.Scanner;

public class PlayYourCardsExercitiul1 {
    public static void main(String[] args) {
        int two=2;
        int three=3;
        int four=4;
        int five=5;
        int six=6;
        int seven=7;
        int eight=8;
        int nine=9;
        int ten=10;
        int queen=10;
        int king=10;
        int ace=11;
        Scanner cardsReceived=new Scanner(System.in);
        System.out.println("First card: ");
        int x=cardsReceived.nextInt();
        System.out.println("Second card: ");
        int y=cardsReceived.nextInt();
        int score=x+y;
        if (score==22) {
            System.out.println("Must be splitted " + (x + y) / 2);
        }
        else{
            System.out.println("Score of the 2 cards are: " +score);
        }
    }
}
