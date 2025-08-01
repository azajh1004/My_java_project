package ch04_class;

public class Saram05 {
    private String name ;
    private double height ;
    private double weight ;

    //Hobby는 생성자를 통하여 입력하지 않으면 기본값으로"축구"
    private String hobby = "축구";
    private String blood ;

    //public 이름(){}
    public Saram05(String name, double height , double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram05(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "축구";
        this.blood = blood;

    }

    public Saram05(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "축구";
        this.blood = blood;
    }

    public void display(){
            System.out.println("이름 : " + name);
            System.out.println("키 : " + height);
            System.out.println("몸무게 : " + weight);
            System.out.println("취미 : " + hobby);
            System.out.println("혈액형 :" + blood);


        }
    }
