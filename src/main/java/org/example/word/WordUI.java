package org.example.word;

//로직 위주의 객체 - 인스턴스 변수
//여러 메서드에서 사용
//메소드의 결과를 계속 보관하는 경우
//협력자(조력자) 인스턴스 변수
//한번 만들어서 여러번 사용하는 객체
//UI는 대부분 void

import java.util.Scanner;

public class WordUI {

    //의존성 주입: WordUI의 조력자 WorldSvc (의존적인 관계) => 인스턴스 변수
    private WordService service;

    //제약조건: WordSvc 타입에 뭔가가 있어야지만(서비스 객체를 넣어야지만) UI가 온전히 만들어짐
    //WordUI라는 사람에게 WordSvc를 사람을 소개 => 대외적으로 WordSvc 아니면 일 안한다는 의미
    //내부에서 만들어진것 X
    public WordUI(WordService serviceObj){
        this.service = serviceObj; //내 서비스를 담당해주는 사람이니까 this.service
    }

    //문제 푸는 기능 설계 => 동사로
    public void exam(){

        Scanner scanner = new Scanner(System.in);

        //단어 얻어오기
        WordVO word = this.service.getNextWord();

        System.out.println(word.getKor()); //한국어를 먼저 보여주고
        String answer = scanner.nextLine(); //사용자에게 입력 받음

        if(answer.equals(word.getEng())){ //한국어랑 입력값이랑 비교

            System.out.println("Correct!!!");
        }else {
            System.out.println("Wrong!");
        }

    }

}
