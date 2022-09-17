import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");

        String feedback = "";
        int age = scanner.nextInt();


        if (age < 20) {
            switch (age) {
                case 1:
                    feedback = "one";
                    break;
                case 2:
                    feedback = "two";
                    break;
                case 3:
                    feedback = "three";
                    break;
                case 4:
                    feedback = "four";
                    break;
                case 5:
                    feedback = "five";
                    break;
                case 6:
                    feedback = "six";
                    break;
                case 7:
                    feedback = "seven";
                    break;
                case 8:
                    feedback = "eight";
                    break;
                case 9:
                    feedback = "nine";
                    break;
                case 10:
                    feedback = "ten";
                    break;
                case 11:
                    feedback = "eleven";
                    break;
                case 12:
                    feedback = "twelve";
                    break;
                case 13:
                    feedback = "thirteen";
                    break;
                case 14:
                    feedback = "fourteen";
                    break;
                case 15:
                    feedback = "fifteen";
                    break;
                case 16:
                    feedback = "sixteen";
                    break;
                case 17:
                    feedback = "seventeen";
                    break;
                case 18:
                    feedback = "eighteen";
                    break;
                case 19:
                    feedback = "nineteen";
                    break;
            }
        } else if (age < 100 && age % 10 != 0) {
            switch (age / 10) {
                case 2:
                    feedback = "twenty " + feedback;
                    break;
                case 3:
                    feedback = "thirty " + feedback;
                    break;
                case 4:
                    feedback = "forty " + feedback;
                    break;
                case 5:
                    feedback = "fifty " + feedback;
                    break;
                case 6:
                    feedback = "sixty " + feedback;
                    break;
                case 7:
                    feedback = "seventy " + feedback;
                    break;
                case 8:
                    feedback = "eighty " + feedback;
                    break;
                case 9:
                    feedback = "ninety " + feedback;
                    break;

                case 10:
                    feedback = "one hundred " + feedback;
                    break;
            }


        } else {

            switch (age / 10) {
                case 2:
                    feedback = "twenty ";
                    break;
                case 3:
                    feedback = "thirty ";
                    break;
                case 4:
                    feedback = "forty ";
                    break;
                case 5:
                    feedback = "fifty ";
                    break;
                case 6:
                    feedback = "sixty ";
                    break;
                case 7:
                    feedback = "seventy ";
                    break;
                case 8:
                    feedback = "eighty ";
                    break;
                case 9:
                    feedback = "ninety ";
                    break;
            }
        }
                if (age > 100) {
                    switch (age / 100) {
                        case 1:
                            feedback = "one hundred " + feedback;
                            break;
                    }
                }
                System.out.print(feedback + " years");
            }

        }




