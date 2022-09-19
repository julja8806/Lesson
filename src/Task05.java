import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");

        int n = scanner.nextInt();
        
        if (n < 20) {
            switch (n) {
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
        } else if (n < 100 && age % 10 != 0) {
            switch (n / 10) {
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

            switch (n / 10) {
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
                if (n > 100) {
                    switch (n / 100) {
                case 1:
                            feedback = "one hundred " + feedback;
                            break;
                case 2:
                            feedback = "two hundred " + feedback;
                            break;
                case 3:
                    feedback = "three hundred " + feedback;
                    break;
                case 4:
                    feedback = "four hundred " + feedback;
                    break;
                case 5:
                    feedback = "five hundred " + feedback; 
                    break;
                case 6:
                    feedback = "six hundred " + feedback;
                    break;
                case 7:
                    feedback = "seven hundred " + feedback;
                    break;
                case 8:
                    feedback = "eight hundred " + feedback;
                    break;
                case 9:
                    feedback = "nine hundred " + feedback;
                    break;
                    }
                }
}

           System.out.println(res);
       }

}


