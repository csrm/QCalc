package com.crio.qcalc;

public class StandardCalculator {
    int result;
    public void add(int x,int y){
        long sum = (long)x+(long)y;
        if(sum > Integer.MAX_VALUE)
          throw new ArithmeticException();
        else
          result = x+y;
    }
    public void subtract(int x,int y){
        long sub = (long)x-(long)y;
        if(sub < Integer.MIN_VALUE)
          throw new ArithmeticException();
        else
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
