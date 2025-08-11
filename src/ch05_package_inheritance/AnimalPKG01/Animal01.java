package ch05_package_inheritance.AnimalPKG01;
// super
public class Animal01 {
    private String name;
    private int lifespan;
    private String habit;
    private int speed;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }





    public Animal01(String name, int lifespan, String habit, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habit = habit;
        this.speed = speed;

    }
    public void showInfo() {
        String message = "평균 수명이 " + this.lifespan + "인" + this.name + "의 ";
        message += " 서식지는 " + this.habit + "입니다.";
        System.out.println(message);
    }
}
