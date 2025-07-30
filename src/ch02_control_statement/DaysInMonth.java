package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 10 ;
        int last_day =  0 ;

        //switch case 구문 사용하기
        switch ( month ) {
            case 1:case 3:case 5:case 7: case 8: case 10: case 12:
                last_day = 31;
                break;
            case 4:case 6: case 9: case 11:
                last_day = 30;
                break;
            case 2:
                last_day = 28;
                break;
            default:
                System.out.println("잘못된 월입니다");
        }

        System.out.println(month + "월의 마지막 날은 " + last_day + "일입니다.");

    }
}
