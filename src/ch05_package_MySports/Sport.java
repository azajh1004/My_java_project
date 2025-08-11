package ch05_package_MySports;
// super 클래스
public class Sport {
    private String name;
    private int entry;

    public Sport(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    protected void showInfo() {
        String message = name + "경기는 " + this.entry + "의 엔트리로 구성이 됩니다.";
        System.out.println(message);
    }
}

