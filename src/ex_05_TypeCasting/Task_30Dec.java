package ex_05_TypeCasting;

import java.util.Scanner;

public class Task_30Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int i = scan.nextInt();
        if (i >=90 && i<= 100)
            {System.out.println("A");}
         else if (i>=80 && i<= 89) {
             System.out.println("B");}
        else if  (i>=70 && i<= 79)
            {System.out.println("C");}
        else if  (i >=60 && i<= 69)
        {            System.out.println("D");}
        else if  (i >=0 && i<= 59)
        {            System.out.println("F");}

    }
}
