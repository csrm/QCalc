package com.crio.qcalc;

public class StandardCalculator {
    protected double result;

    public void multiply(int x,int y) {
      long mul =(long)x * (long)y;
      if(mul>Integer.MAX_VALUE)
        throw new ArithmeticException();
      result = x*y;
    }

    public void divide(int x,int y) {
      result = (double)x/(double)y;
    }

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

    public double getResult(){
        return result;
    }
    
    public void setResult(int value){
        if(value != 0)
          return;
        this.result = value;
    }
}
