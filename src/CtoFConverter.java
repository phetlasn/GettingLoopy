import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        boolean done = false;
        double celsiusTemp = 0;
        String trash = " ";
        do {
            Scanner in = new Scanner(System.in);
            System.out.printf("Enter the temperature in celsius: ");
            if (in.hasNextDouble()) {
                celsiusTemp = in.nextDouble();
                in.nextLine();
                double fTemp = (celsiusTemp * 9/5) + 32;
                System.out.println(fTemp);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You did not enter a valid input");
                done = false;
                System.out.println("Try again");
            }
        }while (!done);
    }
}
