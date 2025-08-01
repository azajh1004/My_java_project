package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04() ; // 김철수
        soo.display() ;

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "퀄트", "AB") ; // 박영희
        hee.display() ;

        //김유신에 대하여 생성자를 오버로딩해 보세요.
        //단, 입력하지 않은 취미의 기본 값은 "볼링"이라고 가정
        Saram04 yusin = new Saram04("김유신", 175.5, 70.5, "o") ; // 김유신
        yusin.display() ;

        Saram04 chio = new Saram04("최유식", 175.5, 70.5, "B") ; // 최유식
        chio.display() ;
    }
}
