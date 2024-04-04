package Homework4;

import java.util.Scanner;

public class PlayYourCardsExercitiul3 {
    public static void main(String[] args) {
        Scanner receivedCards=new Scanner(System.in);
        System.out.println("First card: ");
        int x= receivedCards.nextInt();
        System.out.println("Second card: ");
        int y= receivedCards.nextInt();
        int handScore= x+y;
        int ace=11;
        if (handScore==21){
            System.out.println("You win!");

        }

    }
}
