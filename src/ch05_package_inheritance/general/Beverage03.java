package ch05_package_inheritance.general;
// super 클래스
public class Beverage03 {
    private  String name;
    private  double price;

    //접근지정자 반환타입은 적지 마시오 생성자이름(매개변수){.....}
    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }
}
