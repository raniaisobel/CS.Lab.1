import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String age = scanner.nextLine();
        int ageNumb = Integer.parseInt(age);
        System.out.println(age+"-year olds should read at least "+(100-ageNumb)+" pages before giving up on a book.");
    }
}
