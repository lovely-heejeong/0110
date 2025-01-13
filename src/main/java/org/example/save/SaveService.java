package org.example.save;

public class SaveService {
    //인스턴스 변수 - 계속 유지되는 값은 잔액
    private int balance;

    //기능 설계
    //금액 입금
    public int in(int amount){
        int result = 0;

        this.balance += amount; //입금하면 <내가 가진> 잔액 + 새로 입금한 금액을 더함

        result = this.balance;

        return result;
    }

    //출금
    public int out (){
        int result = 0;

        return result;
    }



}
