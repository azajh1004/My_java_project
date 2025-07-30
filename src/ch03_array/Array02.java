package ch03_array;

public class Array02 {
    public static void main(String[] args) {
        System.out.println("초기화 기법을 이용한 배욜 정의");
        String [] name= {"진", "뷔", "정국", "rm", "지민", "슈가", "제이홈"} ;

        System.out.println("배욜 요소 출력하기");
        for (int i = 0; i < name.length ; i++){
            System.out.println("bts[" + i +"] = " + name[i]);
        }
    }
}
