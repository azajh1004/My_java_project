package ch1_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; // 10 != 8 true
        boolean bool2 = --a == b++ ; //a=a-1=10-1=9  9==8-->false b=b+1=8+1=9 b=b-1=9-1=8
        boolean bool3 = a++ != --b ;  //9!=8 a=a+1=9+1=10
        boolean bool4 = bool3 && (5>7) ; //true && false-->false
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ;//!false||(true&&false)

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);
    }
}
