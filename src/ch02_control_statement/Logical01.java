package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {
        //다중택일 (조건식,연산자,문장조합)
        int month = 8 ;
        String season ;

        if(month >=3 && month <=5){
            season = "봄";
        }else if(month >=6 && month <=8){
            season = "여름";
        }else if(month >=9 && month <=11){
            season = "가을";
        }else{
            season = "겨울";
        }
        String message = month + "월은 " + season + "입니다.";
        System.out.println(message);
    }
}
