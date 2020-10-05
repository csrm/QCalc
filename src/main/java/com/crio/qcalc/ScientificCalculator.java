package com.crio.qcalc;

import java.lang.Math;

public class ScientificCalculator extends StandardCalculator {

    public void add(double x,double y) {
        result = x+y;
    }

    public void subtract(double x,double y) {
        result = x-y;
    }

    public void multiply(double x,double y) {
       
        result = x*y;
    }

    public void divide(double x,double y) {
        result = x/y;
    }

    public void pow(double x,double y) {
        result = Math.pow(x,y);
    }

    @Override
    public void add(int x,int y) {
        if((long)x+(long)y > Integer.MAX_VALUE)
          throw new ArithmeticException();
        this.add((double)x,(double)y);
    }

    @Override
    public void subtract(int x, int y) {
        if(x-y < Integer.MIN_VALUE)
          throw new ArithmeticException();
        this.subtract((double)x,(double)y);
    }

    @Override
    public void multiply(int x,int y) {
        if(x*y > Integer.MAX_VALUE)
          throw new ArithmeticException();
        this.multiply((double)x,(double)y);
    }

    @Override
    public void divide(int x,int y) {
        if(x/y > Integer.MAX_VALUE || x/y < Integer.MIN_VALUE)
          throw new ArithmeticException();
        this.divide((double)x,(double)y);
    }

    
}
