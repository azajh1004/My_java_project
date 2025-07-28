package ch1_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c = ++a + b++ ;
        //3    1 2 4
        System.out.println("a : " + a);//11
        System.out.println("b : " + b);//21
        System.out.println("c : " + c);//31 c=11+20=31

        c = a++ + --b ;
        //3  4  2  1    c=20+11=31  a=11 b=21 c=31
        System.out.println("a : " + a);//12
        System.out.println("b : " + b);//20=21-1
        System.out.println("c : " + c);//31=20+11

        a = 15 ;
        b = 12 ;

        c   =   --a     +   --b ;
        //   4      1     3    2
        System.out.println("a : " + a);//14=15-1
        System.out.println("b : " + b);//11=12-1
        System.out.println("c : " + c);//25=14+11


        a = 10;
        b = 20;

        ++a ;//  a = 10 + 1 = 11
        b-- ;//  a = 20 - 1 = 19
        c = ++a + b--;
          //3  1  2 4
        System.out.println("a : " + a);//12
        System.out.println("b : " + b);//18
        System.out.println("c : " + c);//31

        a = 1;
        b = 1;

        ++a ;
        b++ ;
        c = ++a + b++;

        System.out.println("a : " + a);//3
        System.out.println("b : " + b);//3
        System.out.println("c : " + c);//3



    }
}
