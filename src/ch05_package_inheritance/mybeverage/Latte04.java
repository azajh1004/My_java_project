package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    @Override
    public String toString() {
        String message = "우유 타입 : " + this.milkType;
        System.out.println(message);
        return super.toString();
    }

    public void enjoyLatte(){
        String message = "부드럽고 크리마한 " + super.getName() + "을 마십니다";
        System.out.println(message);
    }

    public Latte04(String name, double price, String milkType){
        super(name, price);
        this.milkType = milkType;

    }
}
