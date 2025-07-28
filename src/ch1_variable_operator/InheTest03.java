package ch1_variable_operator;

public class InheTest03 {
    public static void main(String[] args) {
        double d = 100 ;
        System.out.println(" d : " + d);//암시적 큰 범주

        int i = (int)12.5 ;// 실수 ,정수 확인
        System.out.println(" i :" + i);

        System.out.println(14/5);//정수 나누기 정수는 정수

        System.out.println((double) 14/5);
        //double) 14/5-->14.0/5-->14.0/5.0-->2.8
        //           명시적    암시적

        System.out.println((double) (14/5));
        //(double) (14/5)-->(double)(2)-->2.0
        //              산술연산        명시적

        int kor =50, eng = 60, math = 80 ;

        int total = kor + eng + math ;
        double average =  (double) total / 3.0 ;

        System.out.println("총점 :" + total);
        System.out.println("평균 :" + average);


        int z = (int)5.0 ;
        System.out.println("z :" + z);

        double y = (double)5 ;
        System.out.println("y :" + y);

        float r = 3 ;
        System.out.println("r :" + r);

        char ch1 = 'c' ;//99
        char ch2 = 'a' ;//97

        boolean bool1 = ch1 > ch2 ;
        System.out.println("bool1 :" + bool1);
        // 암시적 형변환으로 99>97 즉, true

        int result ;
        result = ch1 - ch2 + 5 ;
        System.out.println("result : " + result);

        char ch3 = 'D' ;

        String str = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;
        System.out.println("대문자 판다 : " + str);

        //대입 연산자는 갑을 덥어 씁니다.
        //숫자형인 경우 복합 대입 연산자는 값이 누적됩니다.
        //문자열인 경우 복합 대입 연산자는 문자열을 결합합니다
        //관계 연산자의 연산 결과물은 boolean 타입 입니다
        //경우의 수가 2가지인 경우, 적절한 연산자는 삼항 연산자
        //숫자간의 비교 연산이 가능한 이유는 암시적 형변환이 이루어지기 때문
        //어떤 정수가 짝수인지 홀수인지 판단하기 위해서는 대입,산술, 삼항 연산자
        //String str = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;









    }
}
