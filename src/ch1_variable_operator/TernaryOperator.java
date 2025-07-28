package ch1_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        //3항 연산자
        int a = 3, b = 50;
        int result = a >= b ? a - b : b - a ;

        System.out.println("절대 값 : " + result);

        int x = 5 ;
        result = x % 2 == 0 ? x + 3 : x * x ;

        System.out.println("절대 값 : " + result);

        x = 8 ;
        int y = 40;

        result = x >= y ? x : y ;
        System.out.println("절대 값 : " + result);


        result = x <= y ? x : y ;
        System.out.println("절대 값 : " + result);

        x = 5 ;
        y = 12 ;

        String str = y % x == 0  ?   "yes" :  "no" ;
        System.out.println("절대 값 : " + str);

        String message ;

        int su = 8 ;
        String msg = su%2 ==0 ? "짝수" : "홀수" ;

        //숫자 7은 홀수입니다.
        message = "숫자" + su + "은" + msg + "입니다.";
        System.out.println(message);

        int score = 50 ; //60점 이상이면 합격
        msg = score >= 50 ? "합격" : "불합격";

        // 85점이므로 합격입니다
        message = score + "점이므로" + msg + "입니다";
        System.out.println(message);



    }
}
