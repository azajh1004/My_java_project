package ch06_abstract_interface.cartest;

public interface Speed {
    int ALLOWED_MAX_SPEED = 50;
    void speedUp(int speed);
    void speedDwon(int speed);
}
