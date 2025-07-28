package ch1_variable_operator;

public class Increment01 {
    public static void main(String[] args) {

        int x = 5 ; // 할당

        x += 3; // x = x + 3 복합대입 연산자
        System.out.println("x : " + x);//x=8

        x *= 4; // x = x * 4 x=8
        System.out.println("x : " + x);//x=32

        x %= 5; // x =32
        System.out.println("x : " + x);


        x -= 1; // x=x
        System.out.println("x : " + x);

        x += 7; // x =
        System.out.println("x : " + x);

    }
}
