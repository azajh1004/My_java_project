package ch05_package_inheritance.general;
// sub 클래스 ; 사용 extends 슈퍼클래스
public class Latte03 extends Beverage03 {
    private String milkType; // 우유의 타입

    public Latte03(String name, int price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("우유의 타입 : " + this.milkType);
        System.out.println();
    }
}
