package com.crio.qcalc;

public class StandardCalculator {
    int result;
    public void add(int x,int y){
        result = x+y;
    }
    public void subtract(int x,int y){
        result = x-y;
    }
    public int getResult(){
        return result;
    }
    public void setResult(int value){
        if(value != 0)
          return;
        this.result = value;
    }
}
