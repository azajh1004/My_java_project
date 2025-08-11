package ch05_package_inheritance.AnimalPKG01;

public class Eagles01 extends Animal01{
    private int wing;

    @Override
    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "의 날개 개수는 " + wing + "개 입니다";
        System.out.println(message);
    }

    public Eagles01(String name, int lifespan, String habit, int speed, int wing) {
        super(name, lifespan, habit,speed);
        this.wing = wing;

    }

    public void fly(){
        String message = super.getName() + "가 " + super.getSpeed() + "로 날아 다닙니다.";
        System.out.println(message);

    }
}
