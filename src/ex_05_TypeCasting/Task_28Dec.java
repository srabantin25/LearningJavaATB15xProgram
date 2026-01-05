package ex_05_TypeCasting;

public class Task_28Dec {

    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        int i;
    for (i=1;i<=100;i++)
    {
        if (i% 3 ==0 && i %5==0)
            System.out.println("FIZZBUZZ: " +i);
        else
        if (i%3==0)
            System.out.println("Fizz: " + i);
        else if (i %5==0)
        System.out.println("Buzz: " + i);
        else
            System.out.println( "Number is not multiplication of 3 & 5: " + i);

    }




    }
}
