package org.example.word;

import java.util.ArrayList;

public class WordService {

    //생성자에서 필요한 단어 준비
    //객체가 word 데이터 유지
    private ArrayList<WordVO> wordList;

    public WordService(){
        wordList = new ArrayList<>();
        wordList.add(new WordVO("사과", "apple"));
        wordList.add(new WordVO("바나나", "banana"));
        wordList.add(new WordVO("강아지/개","dog"));
    }

    //네이밍 중요
    //일단은 에러가 나지 않게 해놓고 수정
    //다음 단어를 뽑아주는 기능, 기능을 할 때마다 단어를 내놓음
    public WordVO getNextWord(){

        WordVO word = null; //int 값이 아니므로 0 사용 불가, 모든 참조자료형엔 null 입력 가능
        word = wordList.remove(0); //호출하면 순서대로 나오고 끝

        return word;

    }

}
