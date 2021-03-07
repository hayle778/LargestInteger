import java.util.Scanner;

public class Large {

public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int a = input .nextInt();
    System.out.println("Enter a number: ");
    int b = input .nextInt();


    if(a>b ){
        System.out.println("the largest number is " + a);
    }
    else if(b< a ){
        System.out.println("the second largest number: "+ b);
    }

else{
    System.out.println(" a is the first largest integer "+ "b is the second largest integer ");
    }


}

}
