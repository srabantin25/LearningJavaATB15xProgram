package ex_05_TypeCasting;

public class Lab067_Task {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int Max = (n1>n2)? n1:(n2>n3)? n2:n3;// variable = (condition) ? expressionTrue :  expressionFalse;
        System.out.println("Max of three number :" +Max);
    }
}
