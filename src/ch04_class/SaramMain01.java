package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        //int x ;
        //System.out.println(x); 지역변수는 초기값이 없기 때문에 받듯이 초기값 지정

        // 단계 2 : 객체 생성
        // 클래스이름 객체 이름 = new 생성자 이름() ;
        Saram01 yusin = new Saram01() ;

        Saram01 soon ;
        soon = new Saram01() ;

        // 단계3 : 객체의 멤버 변수에 쓰기 작업
        yusin.nationality = "대한민국" ;
        yusin.name = "김유신" ;
        yusin.height = 172.5 ;
        yusin.weight = 72.5 ;
        yusin.hobby = "당구" ;
        yusin.blood = "AB" ;

        // 단계4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality );
        System.out.println("이름 : " + yusin.name );
        System.out.println("키 : " + yusin.height );
        System.out.println("몸무게 : " + yusin.weight );
        System.out.println("취미 : " + yusin.hobby );
        System.out.println("혈액형 : " + yusin.blood );

        soon.nationality = "대한민국" ;
        soon.name = "유관순" ;
        soon.height = 170.5 ;
        soon.weight = 50.0 ;
        soon.hobby = "축구" ;
        soon.blood = "o" ;


        System.out.println("국적 : " + soon.nationality );
        System.out.println("이름 : " + soon.name );
        System.out.println("키 : " + soon.height );
        System.out.println("몸무게 : " + soon.weight );
        System.out.println("취미 : " + soon.hobby );
        System.out.println("혈액형 : " + soon.blood );

        String message = yusin.showGenderInfo(1) ;
        System.out.println(message);

        message = soon.showGenderInfo(2) ;
        System.out.println(message);

        message = yusin.shoBmiInfo() ;
        System.out.println(message);

        message = soon.shoBmiInfo() ;
        System.out.println(message);

        yusin.display();
        soon.display();

    }
}
