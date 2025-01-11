package org.example.word;

import java.util.ArrayList;

public class WordService {

    private ArrayList<WordVO> wordList;

    //생성자, word 데이터 유지
    public WordService(){
        wordList = new ArrayList<>();
        wordList.add(new WordVO("사과", "apple"));
        wordList.add(new WordVO("바나나", "banana"));
        wordList.add(new WordVO("강아지/개","dog"));
    }

    //다음 단어를 뽑아주는 기능, 네이밍 중요
    public WordVO getNextWord(){

        WordVO word = null; //int 값이 아니므로 0 사용 불가, 모든 참조자료형엔 null 입력 가능
        word = wordList.remove(0);

        return word;

    }

}
