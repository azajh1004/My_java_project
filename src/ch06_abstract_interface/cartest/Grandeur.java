package ch06_abstract_interface.cartest;

public class Grandeur extends Car {
    private double fuel;
    private String remark;

    @Override
    public String toString() {
        String message = "연비 : " + this.fuel + "\n";
        message += "연비 메모 : " + this.remark;
        return super.toString() + message;
    }

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;

        if (this.fuel >= 20.0) {
            this.remark = "excellent";
        } else if (this.fuel <= 20.0) {
            this.remark = "good";
        } else {
            this.remark = "poor";
        }
    }

    @Override
    public void display() {
        String message = super.getName() + "의 현재 속도 : " + super.speed + "km";
        System.out.println(message);
    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;
        super.speed = super.checkSpeed();

    }

    @Override
    public void speedDwon(int speed) {
        super.speed -= speed < 0 ? -speed : speed;

    }
}