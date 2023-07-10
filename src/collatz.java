
import java.util.*;
public class collatz {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int n=SC.nextInt();
        while (n!=1)
        {
            //System.out.println(n);
            if(n%2==0){
            n=n/2;
            //System.out.println();
                }
            else {
             n=3*n+1;}
            System.out.println(n);


        }

    }}

