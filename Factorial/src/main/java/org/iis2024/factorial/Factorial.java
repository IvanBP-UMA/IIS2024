package org.iis2024.factorial ;

public class Factorial {

  public long compute(long value) {
    long result = 1;
    if (value < 0) {
      throw new FactorialException("The value " + value + " is negative");
    }

    for (int i = (int)value; i>0; i--){
      result *= i;
    }
    if (result<0){
      throw  new FactorialException("The value is too big");
    }

    return result ;
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    long result = factorial.compute(20) ;
    System.out.println("The factorial of 20 is " + result);
  }

  public void f() {}
}
