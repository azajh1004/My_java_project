package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        // 타입[] 배열명 = new 타입[요소개수];
        Saram05[] sarm = new Saram05[2];

        sarm[01] = new Saram05("서울", "이씨", 170, 65, "축구");
        sarm[02] = new Saram05("부산", "김씨", 184, 78, "야구");

        for (int i = 0; i < sarm.length; i++) {
            sarm[i].display();
            
        }

    }
}
