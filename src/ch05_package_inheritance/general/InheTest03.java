package ch05_package_inheritance.general;

public class InheTest03 {
    public static void main(String[] args) {
        // 다양한 음료 객체 생성
        Americano03 americano = new Americano03("아메리카노", 4000.0, 200.0);//생성자

        Espresso03 espresso = new Espresso03("에스프레소", 5000.0, 2);

        Latte03 latte = new Latte03("라떼", 6000, "아몬드 우유");

        Hotchoco03 hotchoco = new Hotchoco03("핫초코", 5000, 15);


        americano.printInfo();
        espresso.printInfo();
        latte.printInfo();
        hotchoco.printInfo();

    }
}
