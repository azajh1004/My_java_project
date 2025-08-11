package ch05_package_inheritance.AnimalPKG01;

public class Snake01 extends Animal01 {
    private String creep;


    public Snake01(String name, int lifespan, String habit, int speed, String creep) {
        super(name, lifespan, habit, speed);
        this.creep = creep;



    }


}
