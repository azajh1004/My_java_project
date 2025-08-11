package ch05_package_inheritance.general;
// sub 클래스 ; 사용 extends 슈퍼클래스
public class Espresso03 extends Beverage03 {
    private int shotCount; // 샷 추가 계수

    public Espresso03(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 ; " + this.shotCount);
        System.out.println();
    }
}
