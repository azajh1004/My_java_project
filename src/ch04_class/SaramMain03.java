package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {

        Saram03 yusin = new Saram03("김유신", 172.5, 72.5, "당구","AB" ) ;
                yusin.display();

        Saram03 soon = new Saram03("유관순",165,45, "축구", "O") ;
                soon.display();

       /* yusin.name = "김유신" ;
        yusin.height = 172.5 ;
        yusin.weight = 72.5 ;
        yusin.hobby = "당구" ;
        yusin.blood = "AB" ;



        soon.name = "유관순" ;
        soon.height = 170.5 ;
        soon.weight = 50.0 ;
        soon.hobby = "축구" ;
        soon.blood = "o" ;

        System.out.println("이름 : " + soon.name );
        System.out.println("키 : " + soon.height );
        System.out.println("몸무게 : " + soon.weight );
        System.out.println("취미 : " + soon.hobby );
        System.out.println("혈액형 : " + soon.blood );
        */
    }
}