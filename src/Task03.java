import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your letter: ");
        char letter = scanner.next().charAt(0);

        letter = Character.toUpperCase(letter);

        String feedback;

        switch (letter) {
        case 'A':  case'E': case'I': case'O':case'U':feedback = "This letter is vowel";break;
        case 'B':  case'C': case'D': case'H': case'G': case 'J':  case'K': case'L': case'M': case'N':
        case 'P':  case'Q': case'R': case'S': case'T': case 'V':  case'W': case'X': case'Y':case'Z':
        feedback = "This letter is consonant";break;
        default: feedback = "It is no letter";break;
        } System.out.println(feedback);
        scanner.close();
    }

}
