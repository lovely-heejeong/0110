package org.example;

import org.example.save.SaveService;
import org.example.save.SaveUI;
import org.example.word.WordService;
import org.example.word.WordUI;

import java.util.Scanner;

//메인 안에는 메인 메소드만 만들기
public class Main {

    public static void main(String[] args) {

        //UI에게 서비스를 소개
        //휴대폰에 유심 꽂듯이
         WordService wordService = new WordService();
         WordUI wordUI = new WordUI(wordService); //의존성 주입

         wordUI.exam();

         //결과적으로 Main에 남는 코드 => ui만 만들기만 하면 됨
        //SaveUI ui = new SaveUI();
        //ui.doJob();

        }
    }
