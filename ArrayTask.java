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
        int[] array = composeArray(number2);
        display();
        getDPart(array) ;
    


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

    public static void display(){
        Scanner in = new Scanner(System.in);

        boolean flag=true;

        while(flag==false)
        {
            System.out.println("Menu Options:");
            System.out.println("1) Find Min and Max of the List: ");
            System.out.println("2) Find the Average of the List: ");
            System.out.println("3) Display Diffrences From the Average:");
            System.out.println("4) Find the Sum of Odd Numbers");
            System.out.println("5) Find the sum of Even Numbers");
            System.out.println("6) Exit");
            System.out.print("Your choice:");
            int number = in.nextInt();

                if(number==1){

                }

                if(number==2){

                }

                if(number==3){

                }

                if(number==4){

                }

                if(number==5){

                }

                if(number==6){
                    flag=false;
                }
    
        }
        in.close();
    }

    }


    public static void getDPart(int[] array){
        // variables for D part
        int average =  0 ;
        int total = 0;
        String show = "";
        int differences = 0;

        //finding sum of numbers
        for(int i = 0 ; i < array.length ; i++){
            total += array[i]; 
        }

        //finding average
        average = total / array.length;
        
        //finding differences
        for(int i = 0; i < array.length ; i++){
            differences = 0;
            differences = array[i] - average;
            show += differences + " "; 
        }
        //outputs
        System.out.println(show);
    }
    

}