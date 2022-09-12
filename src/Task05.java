import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");

        char n1 = scanner.next().charAt(0);
        char n2 = scanner.next().charAt(1);
        char n3 = scanner.next().charAt(2);
        String res = "Error";

        switch (n1) {
            case '1':
                res = "one hundred";
                break;
            case '2':
                res = "two hundred";
                break;
            case '3':
                res = "three hundred";
                break;
            case '4':
                res = "four hundred";
                break;
            case '5':
                res = "five hundred";
                break;
            case '6':
                res = "six hundred";
                break;
            case '7':
                res = "seven hundred";
                break;
            case '8':
                res = "eight hundred";
                break;
            case '9':
                res = "nine hundred";
                break;

        }

        switch (n2) {
            case '1':
                res = "ten";
                break;
            case '2':
                res = "eleven";
                break;
            case '3':
                res = "twelve";
                break;
            case '4':
                res = "four hundred";
                break;
            case '5':
                res = "five hundred";
                break;
            case '6':
                res = "six hundred";
                break;
            case '7':
                res = "seven hundred";
                break;
            case '8':
                res = "eight hundred";
                break;
            case '9':
                res = "nine hundred";
                break;
        }
    }
}

//            switch (n3) {
//                case '1':
//                    res = "-one";
//                    break;
//                case '2':
//                    res = "-two";
//                    break;
//                case '3':
//                    res = "-three";
//                    break;
//                case '4':
//                    res = "-four";
//                    break;
//                case '5':
//                    res = "-five";
//                    break;
//                case '6':
//                    res = "-six";
//                    break;
//                case '7':
//                    res = "-seven";
//                    break;
//                case '8':
//                    res = "-eight";
//                    break;
//                case '9':
//                    res = "-nine";
//            }
//            System.out.println(res);
//        }




