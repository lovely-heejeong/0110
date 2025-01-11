package org.example.word;

public class WordVO {

    //데이터
    private String kor;
    private String eng;

    public WordVO(String kor, String eng){
        this.kor = kor;
        this.eng = eng;
    }

    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return "WordVO{" +
                "kor='" + kor + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }
}
