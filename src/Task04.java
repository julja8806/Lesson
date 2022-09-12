import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int m = scanner.nextInt();
        String msg = "Error";
        if (m >= 1 && m <= 12) {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    msg = "In this month is 31 days";
                    break;
                case 2:
                    msg = "In this month is 28 days";
                    break;
                default:
                    msg = "In this month is 30 days";
                    break;
            }
        }
        System.out.println(msg);
    }
}
