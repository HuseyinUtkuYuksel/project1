import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

/**
 * ArrayTask
 */
public class ArrayTask {


    public static void main(String[] args) {
        Scanner furkan = new Scanner(System.in);
        System.out.print("Enter number ");
        int number2 = furkan.nextInt() ;
        composeArray(number2);
        

    }

    public static int[] composeArray(int length){

    Random rand = new Random() ;
    int[] yagiz = new int[length] ;
    for(int i =0 ; i < yagiz.length ; i++){
        int number = rand.nextInt(101) ;
        yagiz[i] = number ;
    }
    return yagiz ;
    }
}