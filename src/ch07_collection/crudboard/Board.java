package ch07_collection.crudboard;

import ch06_abstract_interface.animaltest.Bird;

// 이 클래스는 객체 1개를 생성해 내기 위한 탬플릿 클래스로써, 웹 프로그래밍에서는 이름 Bean 클래스라고 부릅니다.
public class Board {
    private  int no;
    private  String title;
    private  String writer;
    private  String reaDate;
    private  int readCount;
    private int rank;
    // 생성자, getter, setter, toSting() 메소드 구현하기 순서

    public Board(){}

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", reaDate='" + reaDate + '\'' +
                ", readCount=" + readCount +
                ", rank=" + rank +
                '}';
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getReaDate() {
        return reaDate;
    }

    public int getReadCount() {
        return readCount;
    }

    public int getRank() {
        return rank;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setReaDate(String reaDate) {
        this.reaDate = reaDate;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }



    public Board(int no, String title, String writer, String readDate, int readCount, int rank) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.reaDate = readDate;
        this.readCount = readCount;
        this.rank = rank;


    }
}
