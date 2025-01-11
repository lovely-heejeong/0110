package org.example;

import org.example.save.SaveService;
import org.example.save.SaveUI;
import org.example.word.WordService;
import org.example.word.WordUI;

import java.util.Scanner;

//메인 안에는 메인 메소드만 만들기
public class Main {
    public static void main(String[] args) {

        WordService wordService = new WordService();
        WordUI wordUI = new WordUI(wordService);
        //UI에게 서비스를 소개
        //휴대폰에 유심 꽂듯이

        wordUI.exam();


        //필요한 객체 준비
        //프로그램 시작
//        SaveUI ui = new SaveUI();
//        ui.doJob();


//        SaveService save = new SaveService();
//        Scanner scanner = new Scanner(System.in);


        //입금 1, 출금 2
//        System.out.println("1.입금, 2.출금, -1:종료");

        //사용자 입력한 것을 oper라는 변수에 담았다
//        String oper = scanner.nextLine();
//
//        switch (oper){
//            case "1":
//                System.out.println("얼마를 입금?");
//                int value = Integer.parseInt(scanner.nextLine());
//                //사용자가 입력한 것을 변환
//
//                int current = save.in(value);
//                System.out.println("현재 잔고는: " + current);
//
//                break;
//            case "2":
//                break;
//            case "-1":
//                break;
//        }


        //만일 입금이라면
        //얼마를 추가할까요?
        // save.in( )호출

        //만일 출금이라면
        //진짜 꺼낼껀가요?
        //save.out( )호출


        }
    }
