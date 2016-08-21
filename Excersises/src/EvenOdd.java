import java.util.Scanner;

/**
 * Created by Admin on 21/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer>> ");
        int number=input.nextInt();
        if((number%2)==0){
            System.out.println(""+number+" is Even");
        } else {
            System.out.println(""+number+" is Odd");
        }

    }
}
