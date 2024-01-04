package com.ohgiraffers.test.model.dto;

public class BookDTO {

    /*
     * bNo : int 도서 번호
     * category : int 도서 분류코드
     * title : String 도서 제목
     * author : String 도서 저자
     * BookDTO()
     * BookDTO(category int . title String author String)
     * setter() / getter()
     * toString(): String
     * setter / getter 메소드 직접 구현
     * java.util.Comparator 인터페이스를 상속받은 정렬용 클래스 작성
     *  > AscCategory , DescCategory */

    private int bNo;
    private int category;
    private String title;
    private String author;


    public int getbNo(){
        return bNo;
    }
    public void setbNo(){
        this.bNo = bNo;
    }

    public int getCategory(){
        return category;
    }
    public void setCategory(){
        this.category = category;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author = author;
    }


    public boolean bo(){
        return bo();
    }









}
