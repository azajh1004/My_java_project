package ch05_package_inheritance.AnimalPKG01;

public class GoldFish01 extends Animal01{
    private int gill;

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 아가미 개수는 " + this.gill + "개 입니다.";
        System.out.println(message);
    }

    public GoldFish01(String name, int lifespan, String habit, int speed, int gill) {
        super(name, lifespan, habit, speed);
        this.gill = gill;
    }

    public void swim(){
        String message = super.getName() + super.getSpeed() + "의 속도로 헤엄칩니다.";
        System.out.println(message);

    }

}
