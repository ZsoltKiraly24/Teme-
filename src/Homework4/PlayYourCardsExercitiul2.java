package Homework4;

import java.util.Scanner;

public class PlayYourCardsExercitiul2 {
    public static void main(String[] args) {
        int ace=11;
        int queen=10;
        int king=10;
        int ten=10;
        int blackJack=21;
        Scanner cardsReceived= new Scanner(System.in);
        System.out.println("First card ");
        int x=cardsReceived.nextInt();
        System.out.println("Second card");
        int y=cardsReceived.nextInt();
        if (x+y==blackJack){
            System.out.println("You have Blackjack");
        }
        else{
            System.out.println("You don't have Blackjack");
        }
    }
}
