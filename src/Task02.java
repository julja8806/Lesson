import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
//String feedback = "Error";
        String age = scanner.nextLine();
        String age2 = scanner.nextLine();
        String age3 = scanner.nextLine();

//        switch (age2) {
//            case "1":
//                System.out.print("один");
//                break;
//            case "2":
//                System.out.print("два");
//                break;
//            case "3":
//                System.out.print("три ");
//                break;
//            case "4":
//                System.out.print("четыре");
//                break;
//            case "5":
//                System.out.print("пять");
//                break;
//            case "6":
//                System.out.print("шесть");
//                break;
//            case "7":
//                System.out.print("семь");
//                break;
//            case "8":
//                System.out.print("восемь");
//                break;
//            case "9":
//                System.out.print("девять");
//                break;
//            case "10":
//                System.out.print("десять");
//                break;}

            switch (age){
                case "2":
                    System.out.print("двадцать");
                    break;
                case "3":
                    System.out.print("тридцать");
                    break;
                case "4":
                    System.out.print("сорок");
                    break;
                case "5":
                    System.out.print("пятьдесят");
                    break;
                case "6":
                    System.out.print("шестьдесят");
                    break;
                case "7":
                    System.out.print("семьдесят");
                    break;
                case "8":
                    System.out.print("восемьдесят");
                    break;
                case "9":
                    System.out.print("девяносто");
                    break;
                case "10":
                    System.out.print("сто");
                    break;
                default:System.out.print("error");
            }

        }
        }



