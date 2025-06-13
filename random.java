// devolop a java programm that is used to print the usernumber is equal to the random number or not. if true then print the randomnumber and usernumber.

import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        
        do{
            System.out.println("enter user number");
             usernumber=sc.nextInt();
            
             if(usernumber==mynumber)
            {
                System.out.println("the guess is correct!");
                break;
            }

            else if(usernumber>mynumber)
            {
                System.out.println("enter the smaller number");
            }

            else
            {
                System.out.println("enter the larger number");
            }

        }while(usernumber>0);
        
        System.out.println("mynumber is:"+mynumber);
        System.out.println("usernumber is:"+usernumber);
        sc.close();
    }
    
}
