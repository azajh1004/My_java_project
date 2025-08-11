package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        // set은 중복여부 X
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";

        System.out.println(findData + " 존재여부 " +  set.contains(findData));

        if(set.contains(findData)){
            System.out.println(findData + "있음");
        }else{
            System.out.println(findData + "없음");
        }

        String addData = "마키아또";

        System.out.println(addData + " 존재요부 " + set.contains((addData)));

        if(set.contains((addData))){
            System.out.println(findData + "있음");
        }else{
            System.out.println(findData + "없음");
        }
        set.add(addData);

        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음'이라는 문구를 출력해 주세요.

        findData = "믹스커피";

        if(set.remove(findData)){
            System.out.println(findData + "삭제성공");

        }else {
            System.out.println(findData + "존재하지 않음");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력"); // 확장(향상) for
        // for(타입 단수이름:복수이름){.........}
        for(Object item:set){
            System.out.println(item);
        }


        System.out.println("요소크기 : " + set.size());
    }
}
