package ch1_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {
        String name;
        double kor, eng;
        double average;

        name = "홍길동";
        kor = 40.0;
        eng = 43.0;
        average = kor + eng / 2;


        System.out.println("name : 홍길동");
        System.out.println("kor : 40.0");
        System.out.println("eng : 43.0");
        System.out.println("average :" + kor + eng / 2);

    }
}