import java.util.*;

public class TempConverter {

    public static void main(String[] args) {

        double input;
        double output;
        boolean inUse = true;
        boolean newTemp = true;
        Scanner sc = new Scanner(System.in);

        while(inUse){

            System.out.println("This is the temperature converter");
            System.out.println("Please enter your temperature: ");

            while(newTemp){
                input = sc.nextInt();
                System.out.println("You Input " + input + " Degrees");

                System.out.println(" If you are converting from Fahrenheit to Celsius, press 1. " +
                        "\n If you are converting from Celsius to Fahrenheit, press 2.");
                int whichUnit = sc.nextInt();

                if(whichUnit == 1){

                    output = (input - 32) * 5/9.0;
                    output = ((int)(output * 100)) / 100.0;
                    System.out.println("Your New Temperature in Celsius is:  " + output + " Degrees");
                    newTemp = false;

                } else {

                    output = ((9.0/5) * input) - 32;
                    output = ((int)(output * 100)) / 100.0;
                    System.out.println("Your New Temperature in Fahrenheit is: " + output + " Degrees");
                    newTemp = false;

                }

            }
            if(newTemp == false){
                System.out.println("Would You Like to Convert Again? \n Press 1 to Continue " +
                        "\n Press 2 to Exit.");
                int continueAnswer = sc.nextInt();
                if(continueAnswer == 1){

                    newTemp = true;
                    inUse = true;

                } else {
                    newTemp = false;
                    inUse = false;
                    System.out.println("Goodbye!");

                }
            }
        }
    }
}