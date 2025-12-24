package ex04_Operators;

public class Lab043_Interview_Contact_Plus {
    public static void main(String[] args) {
        String first_name= "Srabanti";
        String last_name= "Nayak";

        int a = 10;
        int b = 20;
        System.out.println(first_name+last_name+a+b); // if first time is concadenation then next also do the same;
        //SrabantiNayak1020    //jvm run left to right

        System.out.println(a + b+ last_name+ first_name); // first addition and then concadenation
        //30NayakSrabanti

        System.out.println(first_name+last_name+(a+b));
        //SrabantiNayak30


        // first of all , whenever it sees strings,
        // it will do concatenation and for the next
        // one also it will also do concatenation.
        // but when it sees integers first, it will do mathematical operations.
        // the second time it will see strings,
        // then it will do concatenation as well.







    }
}
