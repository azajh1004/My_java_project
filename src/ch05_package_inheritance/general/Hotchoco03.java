package ch05_package_inheritance.general;
// sub 클래스 ; 사용 extends 슈퍼클래스
public class Hotchoco03 extends Beverage03 {
    private double chocoAmount;

    public Hotchoco03(String name, double price, double chocoAmount) {
        super(name, price);
        this.chocoAmount = chocoAmount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 초코의 양 : " + this.chocoAmount);
        System.out.println();
    }
}

