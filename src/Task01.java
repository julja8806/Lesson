import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your card: ");
        int card = scanner.nextInt();

        System.out.println("Input your suit: ");
        int suit = scanner.nextInt();

        String feedback;

        if (card == 6 && suit == 1) {
            feedback = "Your card is six of spades";
        } else if (card == 7 && suit == 1) {
            feedback = "Your card is seven of spades";
        } else if (card == 8 && suit == 1) {
            feedback = "Your card is eight of spades";
        } else if (card == 9 && suit == 1) {
            feedback = "Your card is nine of spades";
        } else if (card == 10 && suit == 1) {
            feedback = "Your card is ten of spades";
        } else if (card == 11 && suit == 1) {
            feedback = "Your card is Jack of spades";
        } else if (card == 12 && suit == 1) {
            feedback = "Your card is Queen of spades";
        } else if (card == 13 && suit == 1) {
            feedback = "Your card is King of spades";
        } else if (card == 14 && suit == 1) {
            feedback = "Your card is Ace of spades";
        } else if (card == 6 && suit == 2) {
            feedback = "Your card is six of clubs";
        } else if (card == 7 && suit == 2) {
            feedback = "Your card is seven of clubs";
        } else if (card == 8 && suit == 2) {
            feedback = "Your card is eight of clubs";
        } else if (card == 9 && suit == 2) {
            feedback = "Your card is nine of clubs";
        } else if (card == 10 && suit == 2) {
            feedback = "Your card is ten of clubs";
        } else if (card == 11 && suit == 2) {
            feedback = "Your card is Jack of clubs";
        } else if (card == 12 && suit == 2) {
            feedback = "Your card is Queen of clubs";
        } else if (card == 13 && suit == 2) {
            feedback = "Your card is King of clubs";
        } else if (card == 14 && suit == 2) {
            feedback = "Your card is Ace of clubs";
        } else if (card == 6 && suit == 3) {
            feedback = "Your card is six of diamonds ";
        } else if (card == 7 && suit == 3) {
            feedback = "Your card is seven of diamonds";
        } else if (card == 8 && suit == 3) {
            feedback = "Your card is eight of diamonds";
        } else if (card == 9 && suit == 3) {
            feedback = "Your card is nine of diamonds";
        } else if (card == 10 && suit == 3) {
            feedback = "Your card is ten of diamonds";
        } else if (card == 11 && suit == 3) {
            feedback = "Your card is Jack of diamonds";
        } else if (card == 12 && suit == 3) {
            feedback = "Your card is Queen of diamonds";
        } else if (card == 13 && suit == 3) {
            feedback = "Your card is King of diamonds";
        } else if (card == 14 && suit == 3) {
            feedback = "Your card is Ace of diamonds";
        } else if (card == 6 && suit == 4) {
            feedback = "Your card is six of hearts";
        } else if (card == 7 && suit == 4) {
            feedback = "Your card is seven of hearts";
        } else if (card == 8 && suit == 4) {
            feedback = "Your card is eight of hearts";
        } else if (card == 9 && suit == 4) {
            feedback = "Your card is nine of hearts";
        } else if (card == 10 && suit == 4) {
            feedback = "Your card is ten of hearts";
        } else if (card == 11 && suit == 4) {
            feedback = "Your card is Jack of hearts";
        } else if (card == 12 && suit == 4) {
            feedback = "Your card is Queen of hearts";
        } else if (card == 13 && suit == 4) {
            feedback = "Your card is King of hearts";
        } else if (card == 14 && suit == 4) {
            feedback = "Your card is Ace of hearts";
        } else {
            feedback = "There is no such card";

        }
        System.out.println(feedback);
        scanner.close();
    }
}