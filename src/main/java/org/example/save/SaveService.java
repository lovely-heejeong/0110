package org.example.save;

public class SaveService {

    //계속 유지되는 값
    private int balance;

    //기능 설계
    //금액 입금
    public int in(int amount){
        int result = 0;

        this.balance += amount;

        result = this.balance;

        return result;
    }

    public int out (){
        int result = 0;

        return result;
    }



}
