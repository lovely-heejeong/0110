package org.example.save;

import java.util.Scanner;

public class SaveUI {

    //유지해야 하는 데이터
    private SaveService service;
    private Scanner scanner;

    //생성자 = 제약조건: ui는 svc가 필요하니까 내가 만들어서 씀
    public SaveUI() {
        this.service = new SaveService();
        this.scanner = new Scanner(System.in);
    }

    //필요한 객체 준비
    //프로그램 시작
    // SaveService save = new SaveService();
    // Scanner scanner = new Scanner(System.in); //제대로 동작하려면 입력받기

    //만일 입금이라면
    //얼마를 추가할까요?
    // save.in( )호출

    //만일 출금이라면
    //진짜 꺼낼껀가요?
    //save.out( )호출


    //해야할 일
    public void doJob(){
        outer:
        while(true){

            //입금 1, 출금 2
            System.out.println("1.입금, 2.출금, -1.종료");
            //입력 받아야 하니까..
            //사용자 입력한 것을 oper라는 변수에 담음
            String oper = scanner.nextLine();

            switch (oper){
                case "1":
                    System.out.println("얼마를 입금?");
                    int value = Integer.parseInt(scanner.nextLine());
                    //사용자가 입력한 문자열을 숫자로 변환, int값 만듦

                    int current = this.service.in(value); //svc.in 호출해서 입력 -> current로
                    System.out.println("현재 잔고는: " + current);

                    break;
                case "2":
                    this.service.out();
                    break;
                case "-1":
                    break outer;
            }//switch

        }//end while

    }

}
