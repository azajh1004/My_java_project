package ch05_package_MySports;

public class SportMain {
    public static void main(String[] args) {
    FootBall footBall = new FootBall("축구", 11, 1, 5);
    footBall.display();

    BaseBall baseBall = new BaseBall("야구", 9, 9, 0.412);
    baseBall.display();
    }
}
