import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private double doubleValue;
    private int intValue;


    public void inputForDouble(Scanner scanner) {

        try {
            this.doubleValue = scanner.nextDouble();
        }catch (InputMismatchException exception) {
            System.out.println("The value is not a double");
            System.exit(0);
        }
    }

    public  void inputForInteger(Scanner scanner) {

        try {
            this.intValue =  scanner.nextInt();
        }catch (InputMismatchException exception) {
            System.out.println("The value is not an Integer!");
            System.exit(0);
        }
    }

    public double getDoubleValue() {
        return this.doubleValue;
    }

    public int getIntValue() {
        return this.intValue;
    }
}
