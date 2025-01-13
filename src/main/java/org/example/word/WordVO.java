package org.example.word;

public class WordVO {

    //데이터
    private String kor;
    private String eng;

    //Constructor
    public WordVO(String kor, String eng){
        this.kor = kor;
        this.eng = eng;
    }

    //Getter
    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }

    //toString: 없으면 @가 나옴
    @Override
    public String toString() {
        return "WordVO{" +
                "kor='" + kor + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }
}
