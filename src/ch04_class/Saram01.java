package ch04_class;

public class Saram01 {

    //단계 1 : 클래스 정의(선언) 뭔 가를 만들어 낼려는 설계, 템플릿, 틀
    // 멤버 변수들
    static String nationality ;

    String name ;
    double height ;
    double weight ;
    String hobby ;
    String blood ;

    //반환타입 메소드이름 (매개 변수리스트){...}
    String showGenderInfo(int juminno){
        String gender = "" ;
        if(juminno == 1 || juminno == 3) {
            gender = "남자" ;
        }else{
            gender = "여자" ;
        }

        String message = name + "님은 " + gender + "이군요" ;

        return message ;
    }
    String shoBmiInfo(){
        double newHeight = height / 100.0 ;
        double rate = weight / (newHeight *newHeight) ;
        String bmi = "" ;

        if(rate >= 25.00){
            bmi = "비만" ;
        }else if(rate <= 25.00){
            bmi = "과체중" ;
        }else if(rate >= 18.50){
            bmi = "정상" ;
        }else{
            bmi = "저체중" ;
        }

        String message = name + "님은 " + bmi + "입니다." ;
        return message ;
    }
    void display(){
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 :" + nationality );
        System.out.println("이름 :" + name + "님");
    }

}
