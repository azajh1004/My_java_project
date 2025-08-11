package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

// 데이터 베이스에게 데이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-ware 성격의 클래스
// 동작 메소드
public class BoardDao {
    private List<Board> boardList = null; // 게시물들을 담는 통(bottle)

    public BoardDao() {  // 초기화
        this.boardList = new ArrayList<Board>(); // 게시물 담는 통 초기화
    }

}