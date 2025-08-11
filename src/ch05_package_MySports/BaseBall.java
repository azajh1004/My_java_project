package ch05_package_MySports;

public class BaseBall extends Sport {
    private int innings;
    private double hitrate;


    public BaseBall(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    public void display() {
        super.showInfo();
        System.out.println(innings + "으로 구성이 되며," + hitrate + "를 기록하였습니다." );

    }
}
