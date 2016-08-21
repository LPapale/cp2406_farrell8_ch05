import java.util.Scanner;

/**
 * Created by Admin on 21/08/2016.
 */
public class AscendingAndDecending {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fist integer>> ");
        int number1=input.nextInt();
        System.out.println("Enter second integer>> ");
        int number2=input.nextInt();
        System.out.println("Enter third integer>> ");
        int number3=input.nextInt();
        int largest=0;
        int middle=0;
        int smallest=0;
// Check if number1 is largest
        if((number1>=number2)&&(number1>=number3)) {
            largest = number1;
            if (number2 >= number3) {
                middle = number2;
                smallest = number3;
            } else {
                middle = number3;
                smallest = number2;
            }
        }
        // Check if number2 is largest
            if((number2>=number1)&&(number2>=number3)) {
                largest = number2;
                if (number1 >= number3) {
                    middle = number1;
                    smallest = number3;
                } else {
                    middle = number3;
                    smallest = number1;
                }
            }
            //Check if number 3 is largest
                if((number3>=number1)&&(number3>=number2)){
                    largest=number3;
                    if(number1>=number2){
                        middle=number1;
                        smallest=number2;
                    }else{
                        middle=number2;
                        smallest=number1;
                    }
        }
        System.out.println("Ascending>> "+smallest+ " "+middle+" "+largest);
        System.out.println("Descending>> "+largest+ " "+middle+" "+smallest);

    }
}
