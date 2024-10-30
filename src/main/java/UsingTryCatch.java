import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9 :");
        Scanner myscan = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {

                //Read user input as a String
                String input = myscan.nextLine();

                //Parse the input to an integer
                int myNum = Integer.parseInt(input);

                //Check if the number is between 0 - 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    validInput = true;
                } else {
                    System.out.println("Not a valid number" + myNum);
                }
            } catch (NumberFormatException ae) {
                System.out.println("Input is not a valid number. Please enter another number");
            }
        }
        myscan.close();
    }
}
