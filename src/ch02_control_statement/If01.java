package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 5 ;

        if(su%2 == 0) {
            System.out.println("짝수" + su + "야~~놀자");
        }

        if(su%2 == 0) {
            System.out.println("숫자" + su + "은(는)짝수 입니다");
            System.out.println("하하하");
        }else{
            System.out.println("숫자" + su + "은(는)홀수 입니다");
            System.out.println("호호호");
        }
        //System.out.println("홀수 짝수 상관 없이 ㅋㅋㅋ");


    }
}
