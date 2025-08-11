package ch05_package_inheritance.general;
// sub 클래스 ; 사용 extends 슈퍼클래스
public class Americano03 extends Beverage03 {
    private  double waterAmount;

    public Americano03(String name, double price, double waterAmount) {
        //super(); // 부모님의 생성자 호출
        super(name, price);
        this.waterAmount = waterAmount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 물의 량 : " + this.waterAmount);
        System.out.println();
    }
}
