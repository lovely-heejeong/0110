package org.example.word;

//로직 위주의 객체 - 인스턴스 변수
//여러 메서드에서 사용
//메소드의 결과를 계속 보관하는 경우
//협력자(조력자) 인스턴스 변수
//한번 만들어서 여러번 사용하는 객체
//UI는 대부분 void

import java.util.Scanner;

public class WordUI {

    //의존성 주입 - WordUI의 조력자 인스턴스 변수, 서비스에 뭔가가 있어야지만 UI가 만들어진다
    //의존적인 관계
    private WordService service;

    //서비스 객체를 넣어야지만 UI가 온전히 만들어진다
    //대외적으로 wordservice 아니면 일 안한다는 의미
    public WordUI(WordService serviceObj){
        this.service = serviceObj;
    }

    //기능 설계, 동사로
    public void exam(){

        Scanner scanner = new Scanner(System.in);

        WordVO word = this.service.getNextWord();

        System.out.println(word.getKor());
        String answer = scanner.nextLine();

        if(answer.equals(word.getEng())){

            System.out.println("Correct!!!");
        }else {
            System.out.println("Wrong!");
        }

    }

}
